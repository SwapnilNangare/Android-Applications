package com.example.mymemory

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mymemory.models.BordSize
import com.example.mymemory.models.MemoryGame
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "Sn"
    }


    private lateinit var rvBoard: RecyclerView
    private lateinit var clRoot: ConstraintLayout
    private lateinit var TvNumMoves: TextView
    private lateinit var TvNumPairs: TextView


    lateinit var adapter: MemoryBordAdapter
    lateinit var memoryGame: MemoryGame
    private var boardSize: BordSize = BordSize.EASY


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clRoot=findViewById(R.id.clRoot)
        rvBoard = findViewById(R.id.rvBord)
        TvNumMoves = findViewById(R.id.TvNumMoves)
        TvNumPairs = findViewById(R.id.TvNumPairs)

        memoryGame = MemoryGame(boardSize)



        adapter = MemoryBordAdapter(this, boardSize, memoryGame.cards, object : MemoryBordAdapter.CardClickListener {

                override fun onCardClick(position: Int) {

                    updateGameWithFlip(position)
                }
            })
        rvBoard.adapter = adapter
        rvBoard.setHasFixedSize(true)
        rvBoard.layoutManager = GridLayoutManager(this, boardSize.getWidth())
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {



        menuInflater.inflate(R.menu.menu_main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId)
        {
            R.id.mi_refresh ->{

            }
            R.id.mi_new_size ->{
                showNewSizeDailog()
                return true

            }
        }


        return super.onOptionsItemSelected(item)
    }

    private fun showNewSizeDailog() {
        showAlertDialog("Choice New Size ",null,)
    }

    private fun showAlertDialog(title: String, view: View?,pos) {

    }

    private fun updateGameWithFlip(position: Int) {

        if (memoryGame.haveWonGame()) {
            Snackbar.make(clRoot, "You Already Won!", Snackbar.LENGTH_LONG).show()
            return
        }
        if (memoryGame.isCardFaceUp(position)) {


            Snackbar.make(clRoot, " Invalid Move!", Snackbar.LENGTH_LONG).show()

            return
        }

        if(memoryGame.flipCard(position))
        {
            Log.i(TAG,"Found a Match! Num Pairs Found:${memoryGame.numPairFound} ")
            TvNumPairs.text="Pair${memoryGame.numPairFound}/ ${boardSize.getNumPairs()}"

            if(memoryGame.haveWonGame()){
                Snackbar.make(clRoot,"You Won! Congratulation.",Snackbar.LENGTH_LONG).show()
            }
        }
        TvNumMoves.text="Moves: ${memoryGame.getNumMoves()}"

        adapter.notifyDataSetChanged()
    }
}