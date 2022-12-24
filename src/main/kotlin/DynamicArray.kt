class DynamicArray() {
    var cards: ArrayList<Card> = arrayListOf()

}

fun DynamicArray.addCard(card: Card){
    cards.add(card)
}
fun DynamicArray.removeCard(cardToBeRemoved: Card){
    for (card in this.cards){
        if (card.checkCardMatching(cardToBeRemoved)){
            cards.removeAt(cards.indexOf(card))
        }
        break
    }
}