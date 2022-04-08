package com.example.bindingadapters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.bindingadapters.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=DataBindingUtil.setContentView( this,R.layout.activity_main)

        val post=Post("Life of Pie","This story is one of the best in the word",
            "https://i.pinimg.com/originals/b2/af/e8/b2afe86be536bbebd95d5ea0bd0ed84c.jpg")
        binding.post=post
    }
}