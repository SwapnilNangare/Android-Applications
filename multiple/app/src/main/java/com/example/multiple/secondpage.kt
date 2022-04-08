package com.example.multiple

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class secondpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondpage)

        val button2=findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val itd=Intent(this,thirdpage::class.java)
            startActivity(itd)
        }
    }
}