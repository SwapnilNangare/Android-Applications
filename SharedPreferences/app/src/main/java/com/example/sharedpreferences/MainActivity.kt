package com.example.sharedpreferences

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    lateinit var sharedPreferences: SharedPreferences
    var isRembered = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sharedPreferences = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        isRembered = sharedPreferences.getBoolean("CheckBOX", false)

        if (isRembered) {
            val i = Intent(this, MainActivity2::class.java)
            startActivity(i)
            finish()

            login.setOnClickListener {
                val name: String = nameEt.text.toString()
                val age: Int = ageEt.text.toString().toInt()
                val checkEd: Boolean = reb.isChecked


                val editor: SharedPreferences.Editor = sharedPreferences.edit()
                editor.putString("NAME", name)
                editor.putInt("AGE", age)
                editor.putBoolean("CHECKBOX", checkEd)
                editor.apply()

                Toast.makeText(this, "Information Saved", Toast.LENGTH_LONG).show()
                val i = Intent(this, MainActivity2::class.java)
                startActivity(i)
                finish()
            }

        }
    }
}