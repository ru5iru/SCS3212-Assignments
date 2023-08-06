package com.example.simpleapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val downloadButton = findViewById<Button>(R.id.downloadButton)

        downloadButton.setOnClickListener{
            val fileUrl = "https://cdn.britannica.com/60/8160-050-08CCEABC/German-shepherd.jpg"
            startFileDownloadService(fileUrl)
        }
    }

    private fun startFileDownloadService(fileUrl: String) {
        val intent = Intent(this,FileDownloadService::class.java)
        intent.putExtra("fileUrl",fileUrl)
        startService(intent)
    }
}