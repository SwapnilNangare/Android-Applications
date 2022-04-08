package com.example.task

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "noteTable")
class Note(
    @ColumnInfo(name = "text") val text: String)
{
    @PrimaryKey(autoGenerate = true) var id=0
}