package com.example.parcelable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object
    {
        const val USER="user"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      val v1=User("Swapnil","Nangare", PersnolInfo("Dada","Kaka"))

        button.setOnClickListener{
            val intent=Intent(this,MainActivity2::class.java)

            intent.putExtra("user", USER)

            startActivity(intent)
        }
    }
}