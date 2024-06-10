package com.example.practicum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val intent1 = Intent(this, MainActivity3::class.java)
            startActivity(intent1)


        }
    }
}

