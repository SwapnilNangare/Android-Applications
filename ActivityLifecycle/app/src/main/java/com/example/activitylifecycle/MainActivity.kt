package com.example.activitylifecycle

import android.content.Intent
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var Tag: String = "Tag"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(Tag, "A onCreate")

        button.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }


    override fun onStart() {
        super.onStart()
        Log.d(Tag, "A onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(Tag, "A onResume")


        }

        override fun onPause() {
            super.onPause()
            Log.d(Tag, "A onPause")
        }

        override fun onStop() {
            super.onStop()
            Log.d(Tag, "A onStop")
        }

        override fun onRestart() {
            super.onRestart()
            Log.d(Tag, "A onRestart")
        }

        override fun onDestroy() {
            super.onDestroy()
            Log.d(Tag, "A onDestroy")
        }


    }


