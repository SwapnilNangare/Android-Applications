package com.example.parcelable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.auth.User

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        intent.let {

            val user= intent.extras?.getParcelable(MainActivity.USER)!! as User



        }
    }
}