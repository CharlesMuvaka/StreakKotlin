class PlayerHand(private val name:String, private val capacity:Int) {
    var playingCards: DynamicArray = DynamicArray()
    val playerName = name
    val cardsToPlayWith = capacity

    //method to sort out the players card in an ascending order
    fun sortCards(){
        val values = IntArray(this.playingCards.cards.size){0}
        val sortedCards = DynamicArray()
        val unsortedCards = this.playingCards

        for (i in playingCards.cards.indices){
            values[i] = this.playingCards.cards[i].cardValue
        }
        values.sort()
        for (i in 0 until cardsToPlayWith){
            val newCard = unsortedCards.getCardByValue(values[i])

            //removing the card from the unsorted list to avoid card repetition
            for (card in unsortedCards.cards){
                if (card.checkCardMatching(newCard)){
                    var index = unsortedCards.cards.indexOf(card)
                    unsortedCards.cards.removeAt(index)
                    break
                }
            }
            sortedCards.addCard(newCard)
        }
        playingCards = sortedCards

    }
}

fun PlayerHand.assignPlayingCards(){
    val deck: CardDeck = CardDeck()
    for (i in 0 until this.cardsToPlayWith){
        deck.allCards.shuffleCards()
        val card:Card = deck.allCards.cards[i]
        this.playingCards.addCard(card)
        deck.allCards.cards.remove(card)
    }

}

fun PlayerHand.displayCards(): String{
    val newLine = "\n"
    var playerCards: String = "${this.playerName} has: $newLine"

    for (card in this.playingCards.cards){
        playerCards += "Card: ${card.cardRank} of ${card.cardSuit._name} ${card.cardSuit._color} $newLine"
    }
    return playerCards
}

