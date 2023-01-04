fun main() {
    val card = Card("2", 2,CardSuit("hearts", "red"))
    val cardOne = Card("3", 3,CardSuit("spades", "black"))
    val cardTwo = Card("J", 11,CardSuit("clubs", "red"))
//    println(card.cardRank)
//    println(card.checkCardMatching(cardOne))
    val  customArrayList = CustomArrayList(5);


//    println(customArrayList.array.size)
//    println(customArrayList.array[1])
//    println(customArrayList.array[2])

    val array:DynamicArray = DynamicArray()

    array.addCard(card)
    array.addCard(cardOne)
    array.addCard(cardTwo)
//    println(array.cards.size)
//    println(array.getCardByValue(2).getCardStringValue())
//    println(array.cards[0].cardRank)

    array.shuffleCards()

//    println(array.cards[0].cardRank)
//    println(getDefaultCardValues("J"))
    val deck: CardDeck = CardDeck()
//    println(deck.allCards.cards.size)

    val player = PlayerHand("Charles", 5);
    player.assignPlayingCards()
//    player.playingCards.shuffleCards()
    println(player.displayCards())
    println(player.sortCards())
    println(player.displayCards())



}