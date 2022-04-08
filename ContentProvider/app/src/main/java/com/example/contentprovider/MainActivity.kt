package com.example.contentprovider

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.provider.ContactsContract
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var context:Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        context=this
        getContatcs()

    }

    @SuppressLint("Range")
    fun getContatcs()
    {
        val Contacts:MutableList<String> = ArrayList()

        val cursor=contentResolver.query(ContactsContract.Contacts.CONTENT_URI,null,null,null,null)
        if(cursor!=null && cursor.moveToFirst())
        {
            do {
                val name=cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME))
                Log.d("getContacts","Contacts name:"+name)
                Contacts.add(name)


            }
            while (cursor.moveToNext())
            cursor.close()
        }
        auto.setAdapter(ArrayAdapter(context,android.R.layout.simple_list_item_1,Contacts))
        auto.threshold=1

        auto.onItemClickListener=object :AdapterView.OnItemClickListener
        {
            override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
             Toast.makeText(context,"Selected Contacts :"+parent?.getItemAtPosition(position),Toast.LENGTH_SHORT).show()
            }

        }

    }


}