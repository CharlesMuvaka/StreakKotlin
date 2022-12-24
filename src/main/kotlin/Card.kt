//create a blueprint to initialise a card instance
class Card(rank:String, value:Int, suit: CardSuit) {
    val _rank: String = rank
    val _value: Int = value
    val _suit: CardSuit = suit
}