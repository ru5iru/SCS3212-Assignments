package com.example.simpleapplication;

import android.app.Service;
import android.content.Intent
import android.os.IBinder
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.io.BufferedInputStream
import java.io.File
import java.io.FileOutputStream
import java.net.URL


class FileDownloadService : Service() {
    companion object {
        private const val TAG = "FileDownloadService"
    }
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val fileUrl = intent?.getStringExtra("fileUrl")
        if (fileUrl != null) {
            downloadFile(fileUrl)
        }
        return START_NOT_STICKY
    }

    private fun downloadFile(fileUrl: String) {
        CoroutineScope(Dispatchers.IO).launch {
            try{
                val url = URL(fileUrl)
                val connection = url.openConnection()
                connection.connect()
                val fileLength = connection.contentLength
                val inputStream = BufferedInputStream(url.openStream())
                val outputStream = FileOutputStream(File(getExternalFilesDir(null),"downloaded_file"))
                val data = ByteArray(1024)
                var total: Long = 0
                var count: Int
                while (inputStream.read(data).also{ count = it } != -1) {
                    total += count.toLong()
                    outputStream.write(data, 0, count)
                }
                outputStream.flush()
                outputStream.close()
                inputStream.close()
                val downloadedFile = File(getExternalFilesDir(null), "downloaded_file")
                val filePath = downloadedFile.absolutePath
                Log.d(TAG, "File downloaded successfully. File path: $filePath")
            } catch (e: Exception) {
                Log.e(TAG, "Error while downloading file: ${e.message}")
                e.printStackTrace()
            }
        }
    }
}