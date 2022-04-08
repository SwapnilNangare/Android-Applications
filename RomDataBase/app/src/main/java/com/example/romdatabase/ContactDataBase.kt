package com.example.romdatabase

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [Contact::class], version = 2)
abstract class ContactDataBase:RoomDatabase() {

abstract fun  contactDao():ContactDAo


}