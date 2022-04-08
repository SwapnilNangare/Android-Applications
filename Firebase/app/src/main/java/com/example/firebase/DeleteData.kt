package com.example.firebase

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.firebase.databinding.ActivityDeleteDataBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class DeleteData : AppCompatActivity() {

    private lateinit var binding: ActivityDeleteDataBinding
    private lateinit var dataBase: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDeleteDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.deleteButton.setOnClickListener {
            val userName = binding.deleteUserName.text.toString()
            if (userName.isNotEmpty()) {
                deleteData(userName)
            } else {
                Toast.makeText(this, "Please enter user name", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun deleteData(userName: String) {

        dataBase = FirebaseDatabase.getInstance().getReference("User")
        dataBase.child(userName).removeValue()

            .addOnSuccessListener {

                binding.deleteUserName.text.clear()


                Toast.makeText(this, "Please enter user name", Toast.LENGTH_SHORT).show()
            }
            .addOnFailureListener {

                Toast.makeText(this, "Failed to delete", Toast.LENGTH_SHORT).show()

            }


    }
}