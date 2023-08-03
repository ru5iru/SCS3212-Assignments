package com.example.simpleapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navigateButton = findViewById<View>(R.id.navigateButton)
        navigateButton.setOnClickListener {
            val message = "Hello from First Activity!"
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("message_key", message)
            startActivity(intent)
        }
    }
}