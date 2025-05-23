package com.alexandre.helloworld

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private val TAG = "INFOTEST"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Log.i(TAG, "Create")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "Start")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "Resume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "Pause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "Stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "Destroy")
    }

} // Fim da class "MainActivity"