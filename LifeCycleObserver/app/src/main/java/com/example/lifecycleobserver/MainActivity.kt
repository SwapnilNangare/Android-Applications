package com.example.lifecycleobserver

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycle.addObserver(observer())
        Log.d("Main", "Activity-onCreate")
    }

    override fun onStart() {
        Log.d("Main", "Activity-onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("Main", "Activity-onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("Main", "Activity-onPause")

        super.onPause()
    }

    override fun onStop() {
        Log.d("Main", "Activity-onStop")

        super.onStop()
    }

    override fun onDestroy() {
        Log.d("Main", "Activity-onDestroy")
        super.onDestroy()
    }
}