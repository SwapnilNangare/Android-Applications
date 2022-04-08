package com.example.task

import androidx.lifecycle.LiveData

class NoteRepository(private val noteDao: NoteDao) {

    val allNote:LiveData<List<Note>> = noteDao.getAllNote()

    suspend fun insert(note: Note){
        noteDao.inset(note)
    }
    suspend fun delete(note: Note) {
        noteDao.delete(note)

    }
}