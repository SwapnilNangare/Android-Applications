package com.example.percentagecalculation

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submit.setOnClickListener() {
            calculatePercentage()
            Amount.text.clear()
            percentage.text.clear()


        }
    }

    private fun calculatePercentage() {

        if (Amount.text.isEmpty() || percentage.text.isEmpty() ) {
            Toast.makeText(this, "Data missing", Toast.LENGTH_SHORT).show()
        } else {
            Ans.text = (Amount.text.toString().toLong() * percentage.text.toString()
                .toLong() / 100).toString()

        }


    }


}