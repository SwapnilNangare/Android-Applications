package com.example.sharedpreferencesstorage

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var sharedPreference:SharedPreferences
    var first_username:String?=null

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(applicationContext,"Welcome to App",Toast.LENGTH_SHORT).show()

        sharedPreference=this.getSharedPreferences(
            "com.example.sharedpreferencesstorage",
             Context.MODE_PRIVATE)
        first_username=sharedPreference.getString("user_name","")
        if(first_username!=null)
        {
            textView2.text="Username:${first_username}"
        }

    }
    fun save_btn(view: View)
    {
        val username=textView.text.toString()
        textView2.text="username:"+username

    }
    fun delete_btn(view:View)
    {
        textView2.text="username:"


    }
}