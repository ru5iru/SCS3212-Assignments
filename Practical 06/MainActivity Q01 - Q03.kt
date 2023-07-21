package com.example.myapplication

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var myReceiver: BroadcastReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myTextView = TextView(this)

        myTextView.text = "Hello, World!"

        myReceiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context?, intent: Intent?) {
                if (intent?.action == "MY_ACTION") {
                    myTextView.text = "Broadcast Received!"
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()

        val filter = IntentFilter("MY_ACTION")
        registerReceiver(myReceiver, filter)
    }

    override fun onPause() {
        super.onPause()

        unregisterReceiver(myReceiver)
    }
}


