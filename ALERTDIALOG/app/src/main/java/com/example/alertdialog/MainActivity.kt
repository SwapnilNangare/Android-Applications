package com.example.alertdialog

import android.app.AlertDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//  Dialog 1
        val addContactDilog= android.app.AlertDialog.Builder(this)
            .setTitle("Add Contact")
            .setMessage(" Do You want to add Swapnil In your Contact List...?")
            .setIcon(R.drawable.ic_launcher_background)
            .setPositiveButton("Yes"){ dialogInterface: DialogInterface, i: Int ->

                Toast.makeText(this,"Your added Swapnil To Contact List ",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("No"){ dialogInterface: DialogInterface, i: Int ->

                Toast.makeText(this,"Your Not added Swapnil To Contact List ",Toast.LENGTH_SHORT).show()
            }.create()

        //adding to btn dialog
        btn1.setOnClickListener{
            addContactDilog.show()
        }

        //  Dialog 2

        val options= arrayOf("Fist Item","Second item","Thread Item")

        val singleChoiceDialog=AlertDialog.Builder(this)
            .setTitle("Choice One of this Options ")
            .setSingleChoiceItems(options,0){ dialogInterface: DialogInterface, i: Int ->
                Toast.makeText(this,"Your Clicked On ${options[i]} ",Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Accept"){ dialogInterface: DialogInterface, i: Int ->

                Toast.makeText(this,"Your Accept SingleChoiceDialog ",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline"){ dialogInterface: DialogInterface, i: Int ->

                Toast.makeText(this,"Your Decline SingleChoiceDialog ",Toast.LENGTH_SHORT).show()
            }.create()

        //applying to btn
        btn2.setOnClickListener{
            singleChoiceDialog.show()
        }

        //  Dialog 3
        val open= arrayOf("1","2","3","4")
        val multiChoiceDialog=AlertDialog.Builder(this)
            .setTitle("Choice The MultiChoice Options ")
            .setMultiChoiceItems(open, booleanArrayOf(false,false,false,false)){ dialogInterface: DialogInterface, i: Int, b: Boolean -> }
        //false mens all item are unchecked initially
            .setPositiveButton("Yes"){ dialogInterface: DialogInterface, i: Int ->

                Toast.makeText(this,"Your Accept MultiChoiceDialog ",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("No"){ dialogInterface: DialogInterface, i: Int ->

                Toast.makeText(this,"Your Not MultiChoiceDialog ",Toast.LENGTH_SHORT).show()
            }.create()
        btn3.setOnClickListener{
            multiChoiceDialog.show()
        }



    }
}