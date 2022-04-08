package com.example.firebase

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.firebase.databinding.ActivityUpdateDataBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class UpdateData : AppCompatActivity() {

    private lateinit var binding: ActivityUpdateDataBinding
    private lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUpdateDataBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.uUpdate.setOnClickListener {

            val userName = binding.uUsername.text.toString()
            val firstName = binding.uFName.text.toString()
            val lastName = binding.uLName.text.toString()
            val age = binding.uAge.text.toString()

            updateData(userName, firstName, lastName, age)
        }
    }

    private fun updateData(userName: String, firstName: String, lastName: String, age: String) {
        database = FirebaseDatabase.getInstance().getReference("User")
        val user = mapOf<String, String>(
            "uFName" to firstName,
            "uLName" to lastName,
            "uAge" to age)

        database.child(userName).updateChildren(user).addOnSuccessListener {
            binding.uUsername.text.clear()
            binding.uFName.text.clear()
            binding.uLName.text.clear()
            binding.uAge.text.clear()
            Toast.makeText(this, "Failed to update", Toast.LENGTH_SHORT).show()
        }.addOnFailureListener {
            Toast.makeText(this, "Failed to update", Toast.LENGTH_SHORT).show()
        }

    }
}