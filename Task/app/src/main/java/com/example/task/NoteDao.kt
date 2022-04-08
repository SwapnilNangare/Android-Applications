package com.example.task

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun inset(note: Note)

    @Delete
    suspend fun delete(note: Note)

    @Query("Select * from noteTable order by id ASC")
    fun getAllNote():LiveData<List<Note>>

}