class PlayerHand(private val name:String, private val capacity:Int) {
    var playingCards: DynamicArray = DynamicArray()
    val playerName = name
    val cardsToPlayWith = capacity
}

fun PlayerHand.assignPlayingCards(){
    val deck: CardDeck = CardDeck()
    for (i in 0 until this.cardsToPlayWith){
        deck.allCards.shuffleCards()
        val card:Card = deck.allCards.cards[i]
        this.playingCards.addCard(card)
        deck.allCards.removeCard(card)
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