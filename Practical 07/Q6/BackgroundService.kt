package com.example.simplebackgroundservice

import android.app.Service
import android.content.Intent
import android.os.Handler
import android.os.IBinder
import android.os.Looper
import android.widget.Toast

class BackgroundService : Service() {

    private lateinit var handler: Handler
    private lateinit var runnable: Runnable

    override fun onCreate() {
        super.onCreate()
        handler = Handler(Looper.getMainLooper())
        startBackgroundTask()
    }

    private fun startBackgroundTask() {
        runnable = object : Runnable {
            override fun run() {
                // Display a Toast message
                showToast("Background Service is running!")

                // Schedule the task to run again after 10 seconds
                handler.postDelayed(this, 10000)
            }
        }
        handler.postDelayed(runnable, 10000)
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onDestroy() {
        super.onDestroy()
        handler.removeCallbacks(runnable)
    }
}