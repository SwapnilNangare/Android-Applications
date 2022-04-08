package com.example.aboutmi

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputBinding
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: InputBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.done_button).setOnClickListener {
            addNikckName(it)
        }


    }

    private fun addNikckName(view: View) {
        val editText = findViewById<EditText>(R.id.nicknameEdit)
        val nickNameTextView = findViewById<TextView>(R.id.nickNameText)

        nickNameTextView.text = editText.toString()
        editText.visibility = View.GONE
        view.visibility = View.GONE

        nickNameTextView.visibility = View.VISIBLE

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)

    }
}