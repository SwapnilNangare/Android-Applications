package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val fistfragment=FirstFagment()
        val secondfragment=SeconfFagment()


        val Fragment1=findViewById<Button>(R.id.Fragment1)
        Fragment1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.Flfragmet,fistfragment)
                addToBackStack(null)
                commit()
            }
        }
        val Fragment2=findViewById<Button>(R.id.Fragment2)
        Fragment2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.Flfragmet,secondfragment)
                addToBackStack(null)
                commit()

            }
        }
    }
}