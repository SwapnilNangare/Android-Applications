package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity2 : AppCompatActivity() {

    var Sag:String="sag"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        Log.d(Sag,"B onCreate")
    }
    override fun onStart() {
        super.onStart()
        Log.d(Sag,"B onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(Sag,"B onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.d(Sag,"B onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(Sag,"B onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(Sag,"B onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(Sag,"B onDestroy")
    }

}