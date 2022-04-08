package com.example.task

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NoteAdapter(private val context: Context, private val listner: INotesRVAdapter) :
    RecyclerView.Adapter<NoteAdapter.NoteViewHolder>() {

    val allNotes = ArrayList<Note>()

    inner class NoteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView = itemView.findViewById<TextView>(R.id.text)
        val deleteButton = itemView.findViewById<Button>(R.id.deleteBtn)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {

        val v =
            NoteViewHolder(LayoutInflater.from(context).inflate(R.layout.item_note, parent, false))
        v.deleteButton.setOnClickListener {
            listner.onIteamClick(allNotes[v.adapterPosition])

        }
        return v
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        val currentNote = allNotes[position]
        holder.textView.text = currentNote.text
    }

    override fun getItemCount(): Int {
        return allNotes.size
    }

    fun updateList(newList: List<Note>) {
        this.allNotes.clear()
        allNotes.addAll(newList)
        notifyDataSetChanged()

    }
}

interface INotesRVAdapter {
    fun onIteamClick(note: Note)
}