package com.example.randomnumber

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder
import java.util.*

class RandomNumberService : Service() {

    private val binder = LocalBinder()
    private val random = Random()

    inner class LocalBinder : Binder() {
        fun getService(): RandomNumberService = this@RandomNumberService
    }

    fun getRandomNumber(): Int {
        return random.nextInt(100) + 1
    }

    override fun onBind(intent: Intent?): IBinder? {
        return binder
    }
}