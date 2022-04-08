package com.example.livedata

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel

    private val factTextView: TextView

    get() = findViewById(R.id.factsTextView)
    private val btnUpdate: Button
    get() = findViewById(R.id.btnUpdate)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider(this).get(mainViewModel::class.java)

        mainViewModel.factLiveData.observe(this, Observer {
            factTextView.text = it

        })
        btnUpdate.setOnClickListener {
            mainViewModel.updateLiveData()

        }
    }
}