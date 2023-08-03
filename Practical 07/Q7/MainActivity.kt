package com.example.randomnumber

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var randomNumberService: RandomNumberService
    private var isBound = false

    private val connection = object : ServiceConnection {
        override fun onServiceConnected(className: ComponentName?, service: IBinder?) {
            val binder = service as RandomNumberService.LocalBinder
            randomNumberService = binder.getService()
            isBound = true
        }

        override fun onServiceDisconnected(arg0: ComponentName?) {
            isBound = false
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        val intent = Intent(this, RandomNumberService::class.java)
        bindService(intent, connection, Context.BIND_AUTO_CREATE)
    }

    override fun onStop() {
        super.onStop()
        if (isBound) {
            unbindService(connection)
            isBound = false
        }
    }

    fun generateRandomNumber(view: View) {
        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        if (isBound) {
            val randomNumber = randomNumberService.getRandomNumber()
            resultTextView.text = "Random Number: $randomNumber"
        }
    }
}