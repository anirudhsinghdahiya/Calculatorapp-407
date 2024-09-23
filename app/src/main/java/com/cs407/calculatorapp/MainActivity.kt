package com.cs407.calculatorapp

import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstNumber = findViewById<EditText>(R.id.firstNumber)
        val secondNumber = findViewById<EditText>(R.id.secondNumber)
        val addButton = findViewById<Button>(R.id.addButton)
        val subtractButton = findViewById<Button>(R.id.subtractButton)
        val multiplyButton = findViewById<Button>(R.id.multiplyButton)
        val divideButton = findViewById<Button>(R.id.divideButton)

        // Ensure that the EditText fields gain focus and the keyboard shows up
        firstNumber.requestFocus()
        val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(firstNumber, InputMethodManager.SHOW_IMPLICIT)

        // Set up click listener for the Add button
        addButton.setOnClickListener {
            val num1 = firstNumber.text.toString().toDoubleOrNull()
            val num2 = secondNumber.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                val result = num1 + num2
                Toast.makeText(this, "Result: $result", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }

        // Set up click listener for the Subtract button
        subtractButton.setOnClickListener {
            val num1 = firstNumber.text.toString().toDoubleOrNull()
            val num2 = secondNumber.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                val result = num1 - num2
                Toast.makeText(this, "Result: $result", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }

        // Set up click listener for the Multiply button
        multiplyButton.setOnClickListener {
            val num1 = firstNumber.text.toString().toDoubleOrNull()
            val num2 = secondNumber.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                val result = num1 * num2
                Toast.makeText(this, "Result: $result", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }

        // Set up click listener for the Divide button
        divideButton.setOnClickListener {
            val num1 = firstNumber.text.toString().toDoubleOrNull()
            val num2 = secondNumber.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                if (num2 != 0.0) {
                    val result = num1 / num2
                    Toast.makeText(this, "Result: $result", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
