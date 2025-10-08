package com.example.counterapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val counterText = findViewById<TextView>(R.id.counterText)
        val incrementButton = findViewById<Button>(R.id.incrementButton)
        val decrementButton = findViewById<Button>(R.id.decrementButton)
        val resetButton = findViewById<Button>(R.id.resetButton)

        incrementButton.setOnClickListener {
            count++
            counterText.text = count.toString()
        }

        decrementButton.setOnClickListener {
            if (count > 0) {
                count--
                counterText.text = count.toString()
            }
        }

        resetButton.setOnClickListener {
            count = 0
            counterText.text = count.toString()
        }
    }
}
