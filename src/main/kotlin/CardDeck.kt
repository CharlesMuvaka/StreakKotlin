class CardDeck {
     val allCards: DynamicArray = DynamicArray()
    init {
        val cardRanks: Array<String> = arrayOf("2","3","4","5","6","7","8","9", "10", "J","Q","K","A")
        val cardSuits: Array<CardSuit> = arrayOf(CardSuit("hearts", "red"),
            CardSuit("spades", "black"),
            CardSuit("diamonds", "red"),
            CardSuit("clubs", "black"),
        )

        for (i in cardRanks.indices){
            for (suit in cardSuits){
                val card:Card = Card(cardRanks[i], getDefaultCardValues(cardRanks[i]), suit)
                allCards.addCard(card)
            }
        }
    }

}

fun getDefaultCardValues(cardRank:String): Int{
    val value = when(cardRank){
        "2" -> 2
        "3" -> 3
        "4" -> 4
        "5" -> 5
        "6" -> 6
        "7" -> 7
        "8" -> 8
        "9" -> 9
        "10" -> 10
        "J" -> 11
        "Q" -> 12
        "K" -> 13
        "A" -> 1
        else -> {0}
    }
    return value
}