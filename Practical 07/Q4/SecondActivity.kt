package com.example.simpleapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val receivedMessage = intent.getStringExtra("message_key")
        if (receivedMessage != null) {
            val statusTextView = findViewById<TextView>(R.id.statusTextView)
            statusTextView.text = receivedMessage
        } else {
            val statusTextView = findViewById<TextView>(R.id.statusTextView)
            statusTextView.text = "No Message"
        }
    }
}