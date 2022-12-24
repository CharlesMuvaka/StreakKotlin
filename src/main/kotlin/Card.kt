//create a blueprint to initialise a card instance
class Card(rank:String, value:Int, suit: CardSuit) {
    val cardRank: String = rank
    val cardValue: Int = value
    val cardSuit: CardSuit = suit
}

fun Card.checkCardMatching(card: Card): Boolean{
    val checkRanks = this.cardRank == card.cardRank
    val checkValues  = this.cardValue == card.cardValue
    val checkSuitColor = this.cardSuit._color == card.cardSuit._color
    val checkSuitName = this.cardSuit._name == card.cardSuit._name

    if (checkRanks && checkSuitName && checkValues && checkSuitColor){
        return true
    }
    return false
}