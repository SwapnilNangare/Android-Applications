package com.example.aaaa

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var editTextName: EditText
    lateinit var button: Button
    lateinit var button2: Button
    lateinit var text: TextView
    lateinit var btn3: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        editTextName = findViewById(R.id.name)
        button = findViewById(R.id.button)
        button2 = findViewById(R.id.button2)
        text = findViewById(R.id.text)
        btn3 = findViewById(R.id.btn3)

        button.setOnClickListener(this)
        button2.setOnClickListener(this)
        text.setOnClickListener(this)
    }


    override fun onClick(view: View?) {

        when (view?.id) {
            R.id.button2 -> {
                val n = editTextName.text
                text.text = "Hello $n i am your Android"

            }
            R.id.button -> {
                val n = editTextName.text
                text.text = "Hello $n"

            }
            R.id.text -> {
                val n = editTextName.text
                text.text = "You Just Click mi"

            }

        }
        btn3.setOnClickListener {
            val intent = Intent(applicationContext, ResultActivity::class.java)
            startActivity(intent)

        }


    }
}