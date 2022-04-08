package com.example.retrofitnetworkcall

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import okio.Utf8.size

class newsAdaptar(val context: Context,val articals: List<Artical>):RecyclerView.Adapter<newsAdaptar.articalViewholdaer>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): articalViewholdaer {

        val view=LayoutInflater.from(context).inflate(R.layout.ltem_layout,parent,false)
        return articalViewholdaer(view)

    }

    override fun onBindViewHolder(holder: articalViewholdaer, position: Int) {

        val artical=articals[position]
        holder.newsTitle.text=artical.title
        holder.NewsDes.text=artical.description

       // load image into Recycler view by using glide library

        Glide.with(context).load(artical.urlToImage).into(holder.newsimg)
        //Glide.with(context).load(PostModel.Posduct_images).into(holder.table_imgs)

        holder.itemView.setOnClickListener{
            Toast.makeText(context,artical.title,Toast.LENGTH_SHORT).show()
        }

    }

       override fun getItemCount():Int
       {
        return articals.size
       }


    class articalViewholdaer(itemView: View):RecyclerView.ViewHolder(itemView)
    {
        var newsimg=itemView.findViewById<ImageView>(R.id.newsimg)
        var newsTitle=itemView.findViewById<TextView>(R.id.newsTitle)
        var NewsDes=itemView.findViewById<TextView>(R.id.NewsDes)



    }
}