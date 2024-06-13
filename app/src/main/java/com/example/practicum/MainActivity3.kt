package com.example.practicum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    
 val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
        val maxTemps = arrayOf(30, 32, 28, 29, 31, 33, 34)
        val minTemps = arrayOf(20, 22, 19, 21, 23, 24, 25)
         val conditions = arrayOf("Sunny", "Cloudy", "Rainy", "Sunny", "Partly Cloudy", "Sunny", "Rainy")




            setContentView(R.layout.activity_main3)

            val textView = findViewById<TextView>(R.id.textView)

            val dataString = buildString {
                append("Days: ${days.joinToString(", ")}\n")
                append("Max Temperatures: ${maxTemps.joinToString(", ")}\n")
                append("Min Temperatures: ${minTemps.joinToString(", ")}\n")
                append("Conditions: ${conditions.joinToString(", ")}")
            }

            textView.text = dataString

        val buttonBack = findViewById<Button>(R.id.buttonBack)
        buttonBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}










