package com.example.simpleapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val statusTextView = findViewById<TextView>(R.id.statusTextView)
        statusTextView.text = "You are in the Second Activity!"
    }
}