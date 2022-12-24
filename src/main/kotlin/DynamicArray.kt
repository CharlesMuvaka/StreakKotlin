import kotlin.random.Random

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

fun DynamicArray.shuffleCards(){
    for (i in 0 until this.cards.size){
        val randomNumber: Int = Random.nextInt(this.cards.size) //generates a random number

        val newCard:Card = this.cards[i] //getting the card at the current iteration
        this.cards[i] = this.cards[randomNumber] //assigning the card at the current iteration to a card from the rando number
        this.cards[randomNumber] = newCard
    }
}