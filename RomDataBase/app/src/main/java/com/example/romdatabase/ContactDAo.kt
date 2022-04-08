package com.example.romdatabase

import androidx.lifecycle.LiveData
import androidx.room.*


//this dtabase operation ,CRUD operations

@Dao
interface ContactDAo {

    @Insert
   suspend fun insertContact(contact: Contact)

    @Update
    suspend fun updateContact(contact: Contact)

    @Delete
    suspend fun deleteContact(contact: Contact)

    @Query("SELECT * FROM contact")
     fun getContact():LiveData< List<Contact>>
}