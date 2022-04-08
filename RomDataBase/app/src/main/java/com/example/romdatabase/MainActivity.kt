package com.example.romdatabase

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
   lateinit var database: ContactDataBase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        database = Room.databaseBuilder(applicationContext, ContactDataBase::class.java,
            "contactDB").build()

        GlobalScope.launch {
            database.contactDao().insertContact(Contact(0, "Swapnil", 12345))

        }

    }
}