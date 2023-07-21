package com.example.simpleaudioplayer
import android.app.Activity
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.net.Uri

class MainActivity : Activity() {
    private lateinit var myTextView: TextView
    private lateinit var playButton: Button
    private lateinit var pauseButton: Button
    private lateinit var resumeButton: Button
    private lateinit var stopButton: Button
    private var myReceiver: BroadcastReceiver? = null
    private var mediaPlayer: MediaPlayer? = null
    private var isPaused: Boolean = false
    private var resumePosition: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myTextView = findViewById(R.id.textView)
        myTextView.text = "Music Player"


        mediaPlayer = MediaPlayer()
        mediaPlayer?.setOnCompletionListener {
            // Audio playback completed, so replay the audio
            mediaPlayer?.seekTo(0)
            mediaPlayer?.start()
        }

        playButton = findViewById(R.id.playButton)
        playButton.setOnClickListener {
            playAudio()
        }

        pauseButton = findViewById(R.id.pauseButton)
        pauseButton.setOnClickListener {
            pauseAudio()
        }

        resumeButton = findViewById(R.id.resumeButton)
        resumeButton.setOnClickListener {
            resumeAudio()
        }

        stopButton = findViewById(R.id.stopButton)
        stopButton.setOnClickListener {
            stopAudio()
        }

        // Prepare the MediaPlayer with the audio file
        try {
            val resourceId = R.raw.audio
            val uri = Uri.parse("android.resource://${packageName}/$resourceId")
            mediaPlayer?.setDataSource(this, uri)
            mediaPlayer?.prepare()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun playAudio() {
        if (!mediaPlayer!!.isPlaying) {
            mediaPlayer?.start()
            isPaused = false
        }
    }

    private fun pauseAudio() {
        if (mediaPlayer!!.isPlaying) {
            mediaPlayer?.pause()
            isPaused = true
            resumePosition = mediaPlayer!!.currentPosition
        }
    }

    private fun resumeAudio() {
        if (isPaused) {
            mediaPlayer?.seekTo(resumePosition)
            mediaPlayer?.start()
            isPaused = false
        }
    }

    private fun stopAudio() {
        if (mediaPlayer!!.isPlaying) {
            mediaPlayer?.stop()
            try {
                mediaPlayer?.prepare()
            } catch (e: Exception) {
                e.printStackTrace()
            }
            isPaused = false
        }
    }

    override fun onResume() {
        super.onResume()
        myReceiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context, intent: Intent) {
                // Handle the MY_ACTION intent
            }
        }

        val intentFilter = IntentFilter("MY_ACTION")
        registerReceiver(myReceiver, intentFilter)
    }

    override fun onPause() {
        super.onPause()
        myReceiver?.let {
            unregisterReceiver(it)
            myReceiver = null
        }

        if (mediaPlayer!!.isPlaying) {
            mediaPlayer?.pause()
            isPaused = true
            resumePosition = mediaPlayer!!.currentPosition
        }
    }

    override fun onStop() {
        super.onStop()
        mediaPlayer?.release()
        mediaPlayer = null
    }
}
