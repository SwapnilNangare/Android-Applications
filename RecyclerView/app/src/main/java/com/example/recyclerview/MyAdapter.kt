package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val songs: List<String>,val dd: List<String>) : RecyclerView.Adapter<MyAdapter.viewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_item, parent, false)
        return viewHolder(view)

    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        holder.texttitle.text=songs[position]
        holder.destitle.text=dd[position]
    }

    override fun getItemCount(): Int {
        return songs.size

    }

    class viewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val texttitle = itemView.findViewById<TextView>(R.id.title)
        val destitle = itemView.findViewById<TextView>(R.id.desc)
    }
}