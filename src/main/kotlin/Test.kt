fun main() {
    val card = Card("2", 2,CardSuit("hearts", "red"))
    val cardOne = Card("3", 3,CardSuit("spades", "black"))
    val cardTwo = Card("4", 3,CardSuit("clubs", "red"))
    println(card.cardRank)
    println(card.checkCardMatching(cardOne))

    val array:DynamicArray = DynamicArray()

    array.addCard(card)
    array.addCard(cardOne)
    array.addCard(cardTwo)
    println(array.cards.size)
    array.removeCard(card)
    println(array.cards.size)
    println(array.cards[0].cardRank)

    array.shuffleCards()

    println(array.cards[0].cardRank)
//    println(getDefaultCardValues("J"))
    val deck: CardDeck = CardDeck()
    println(deck.allCards.cards.size)

    val player = PlayerHand("Charles", 5);
    player.assignPlayingCards()
//    player.playingCards.shuffleCards()
    println(player.displayCards())


}