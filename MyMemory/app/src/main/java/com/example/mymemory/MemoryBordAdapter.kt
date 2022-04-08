package com.example.mymemory

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.mymemory.models.BordSize
import com.example.mymemory.models.MemoryCard
import java.lang.Math.min


class MemoryBordAdapter(

    private val context: Context,
    private val bordSize: BordSize,
    private val Cards: List<MemoryCard>,
    private val cardClickListener: CardClickListener
) :
    RecyclerView.Adapter<MemoryBordAdapter.ViewHolder>() {
    companion object {
        private const val MARGIN_SIZE = 10
        private const val TAG = "Swapnil "
    }


    interface CardClickListener {
        fun onCardClick(position: Int)
        {

        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val cardWidth = parent.width / bordSize.getWidth() - (2 * MARGIN_SIZE)
        val cardHeight = parent.height / bordSize.getHeight() - (2 * MARGIN_SIZE)
        val cardSideLenghth = min(cardWidth, cardHeight)

        val view = LayoutInflater.from(context).inflate(R.layout.memory_card, parent, false)
        val layoutParams =
            view.findViewById<CardView>(R.id.cardView).layoutParams as ViewGroup.MarginLayoutParams
        layoutParams.width = cardSideLenghth
        layoutParams.height = cardSideLenghth
        layoutParams.setMargins(MARGIN_SIZE, MARGIN_SIZE, MARGIN_SIZE, MARGIN_SIZE)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount() = bordSize.numCard


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageButton = itemView.findViewById<ImageButton>(R.id.imageButton)



        fun bind(position: Int) {
            val memoryCard = Cards[position]
            imageButton.setImageResource(if (Cards[position].isFaceUp) Cards[position].identifier else R.drawable.ic_launcher_background)

            imageButton.alpha=if(memoryCard.isMatched).4f else 1.0f
            val colorStateList= if(memoryCard.isMatched) ContextCompat.getColorStateList(context,R.color.color_gray) else null
             ViewCompat.setBackgroundTintList(imageButton,colorStateList)

            imageButton.setOnClickListener {
                Log.i(TAG, "Clicked On position $position ")
                cardClickListener.onCardClick(position)
            }
        }

    }


}
