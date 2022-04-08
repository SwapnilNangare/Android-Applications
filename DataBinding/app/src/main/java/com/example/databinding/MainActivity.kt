package com.example.databinding

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        val quotTextView = findViewById<TextView>(R.id.quoteText)
        val qouteAuthor = findViewById<TextView>(R.id.quoteAuthor)

        val  qouteObj=Qoute("Do or Do not,there is no try","Yoda")
        binding.qoute=qouteObj

//                binding.quoteText.text = "Do or Do not,there is no try "
//        binding.quoteAuthor.text = "Swapnil Nangare"


    }
}