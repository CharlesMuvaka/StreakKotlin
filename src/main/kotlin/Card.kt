//create a blueprint to initialise a card instance
class Card(rank:String, value:Int, suit: CardSuit) {
    var cardRank: String = rank
    var cardValue: Int = value
    var cardSuit: CardSuit = suit
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

fun Card.getCardStringValue(): String{
    return "${this.cardRank} of ${this.cardSuit._name} color ${this.cardSuit._color}"
}