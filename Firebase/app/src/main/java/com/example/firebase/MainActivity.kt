package com.example.firebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.firebase.databinding.ActivityMainBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var  database:DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.login.setOnClickListener{
            val fistName=binding.fName.text.toString()
            val lastName=binding.lName.text.toString()
            val age=binding.age.text.toString()
            val username=binding.Username.text.toString()

            database=FirebaseDatabase.getInstance().getReference("Users")
            val User=User(fistName,lastName,age,username)
            database.child(username).setValue(User).addOnSuccessListener {
                binding.fName.text.clear()
                binding.lName.text.clear()
                binding.age.text.clear()
                binding.Username.text.clear()

                Toast.makeText(this,"SuccessFully Save",Toast.LENGTH_SHORT).show()
            }.addOnFailureListener{
                Toast.makeText(this,"Failed",Toast.LENGTH_SHORT).show()

            }

        }

    }
}