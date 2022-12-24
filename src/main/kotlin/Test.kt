fun main() {
    val card = Card("2", 2,CardSuit("hearts", "red"))
    val cardOne = Card("2", 2,CardSuit("hearts", "red"))
    val cardTwo = Card("2", 2,CardSuit("hearts", "red"))
//    println(card.cardRank)
//    println(card.checkCardMatching(cardOne))

    val array:DynamicArray = DynamicArray()

    array.addCard(card)
    array.addCard(cardOne)
    array.addCard(cardTwo)
    println(array.cards.size)
    array.removeCard(card)
    println(array.cards.size)

}