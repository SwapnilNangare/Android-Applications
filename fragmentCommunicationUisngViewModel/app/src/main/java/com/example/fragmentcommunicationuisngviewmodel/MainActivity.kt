package com.example.fragmentcommunicationuisngviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var viewModel=ViewModelProvider(this).get(viewModelClass::class.java)
        textView.text=viewModel.number.toString()

        button.setOnClickListener{
         viewModel.addNumber()
            textView.text=viewModel.number.toString()

        }
    }
}