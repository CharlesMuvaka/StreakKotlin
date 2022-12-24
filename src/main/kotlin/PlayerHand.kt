class PlayerHand(private val name:String, private val capacity:Int) {
    var playingCards: DynamicArray = DynamicArray()
    private val playerName = name
    val cardsToPlayWith = capacity
}

fun PlayerHand.assignPlayingCards(){
    val deck: CardDeck = CardDeck()
    for (i in 0 until this.cardsToPlayWith){
        val card:Card = deck.allCards.cards[i]
        this.playingCards.addCard(card)
    }
}