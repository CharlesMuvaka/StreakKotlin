class CardDeck {
     val allCards: DynamicArray = DynamicArray()
    init {
        val cardRanks: Array<String> = arrayOf("2","3","4","5","6","7","8","9", "10", "J","Q","K","A")
        val cardSuits: Array<CardSuit> = arrayOf(CardSuit("hearts", "red"),
            CardSuit("spades", "black"),
            CardSuit("diamonds", "red"),
            CardSuit("clubs", "black"),
        )


    }

}

