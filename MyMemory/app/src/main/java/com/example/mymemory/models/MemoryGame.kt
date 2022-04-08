package com.example.mymemory.models

import com.example.mymemory.utils.DEFAULT_ICON

class MemoryGame(private val boardSize: BordSize) {

    val cards: List<MemoryCard>
    var numPairFound = 0

    private var numCardFlips = 0

    private var indexSingleSelectedCard: Int? = null

    init {
        val chosenImages = DEFAULT_ICON.shuffled().take(boardSize.getNumPairs())
        val randomizedImages = (chosenImages + chosenImages).shuffled()
        cards = randomizedImages.map { MemoryCard(it) }
    }

    fun flipCard(position: Int): Boolean {
        numCardFlips++
        val card = cards[position]


        var foundMatch = false

        if (indexSingleSelectedCard == null) {
            restoredcard()
            indexSingleSelectedCard = position
        } else {
            foundMatch = checkForMatch(indexSingleSelectedCard!!, position)
            indexSingleSelectedCard = null
        }

        card.isFaceUp = !card.isFaceUp
        return foundMatch
    }

    private fun checkForMatch(position1: Int, position2: Int): Boolean {

        if (cards[position1].identifier != cards[position2].identifier) {
            return false
        }
        cards[position1].isMatched = true
        cards[position2].isMatched = true
        numPairFound++
        return true


    }

    private fun restoredcard() {
        for (card in cards) {
            if (!card.isMatched) {
                card.isFaceUp = false
            }

        }
    }

    fun haveWonGame(): Boolean {
        return numPairFound == boardSize.getNumPairs()

    }

    fun isCardFaceUp(position: Int): Boolean {
        return cards[position].isFaceUp
    }

    fun getNumMoves(): Int {

        return numCardFlips / 2

    }


}