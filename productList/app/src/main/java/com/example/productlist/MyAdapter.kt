package com.example.productlist

import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView

class MyAdapter():RecyclerView.Adapter<MyViewholder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewholder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MyViewholder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}
class MyViewholder(itemView: View):RecyclerView.ViewHolder(itemView){

}