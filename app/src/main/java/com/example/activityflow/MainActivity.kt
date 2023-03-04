package com.example.activityflow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

// MainActivity.kt
class MainActivity : AppCompatActivity() {
    private lateinit var activity1button: Button
    private lateinit var activity2button: Button
    private lateinit var activity3button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activity1button = findViewById(R.id.button1)
        activity2button = findViewById(R.id.button2)
        activity3button = findViewById(R.id.button3)

        // set click listeners for buttons
        activity1button.setOnClickListener {
            val intent = Intent(this, Activity1::class.java)
            startActivity(intent)
        }

        activity2button.setOnClickListener {
            val intent = Intent(this, Activity2::class.java)
            startActivity(intent)
        }
        activity3button.setOnClickListener {
            val intent = Intent(this, Activity3::class.java)
            startActivity(intent)
        }
    }
}
