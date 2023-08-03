package com.example.simplebackgroundservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startBackgroundService(view: View) {
        val serviceIntent = Intent(this, BackgroundService::class.java)
        startService(serviceIntent)
    }
}