package com.example.dialog2

import android.content.DialogInterface
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val builder=AlertDialog.Builder(this)

        builder.setTitle("Are you Sure")
        builder.setMessage("Swapnil  Can you Close Application")
        builder.setPositiveButton("Yes",{dialogInterface: DialogInterface, i: Int -> finish()})

       builder.setNegativeButton("No",{dialogInterface: DialogInterface, i: Int -> })
        builder.show()

    }
}