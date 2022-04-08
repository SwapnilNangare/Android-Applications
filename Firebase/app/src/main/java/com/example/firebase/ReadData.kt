package com.example.firebase

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.firebase.databinding.ActivityReadDataBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class ReadData : AppCompatActivity() {

    private lateinit var binding: ActivityReadDataBinding

    private lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReadDataBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val loginButton = findViewById<Button>(R.id.btn)


        binding.btn.setOnClickListener {
            val userName: String = binding.Username.text.toString()
            if (userName.isNotEmpty()) {
                readData(userName)
            } else {
                Toast.makeText(this, "Please Enter the userName", Toast.LENGTH_SHORT).show()
            }
        }


    }

    private fun readData(userName: String) {


        database = FirebaseDatabase.getInstance().getReference("user")
        database.child(userName).get().addOnSuccessListener {
            if (it.exists()) {
                val fistName = it.child("firstName").value
                val lastName = it.child("lastName").value
                val age = it.child("age").value
                Toast.makeText(this, "Successfully read", Toast.LENGTH_SHORT).show()
                binding.Username.text.clear()
                binding.firstName.text=fistName.toString()
                binding.lastName.text=lastName.toString()
                binding.age.text=age.toString()



            } else {
                Toast.makeText(this, "Please Enter the correct userName", Toast.LENGTH_SHORT).show()


            }
        }.addOnFailureListener {
            Toast.makeText(this, "Please Enter the correct userName", Toast.LENGTH_SHORT).show()


        }
    }
}