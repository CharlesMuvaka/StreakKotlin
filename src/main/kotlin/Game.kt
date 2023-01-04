import java.util.Scanner

class Game {
    private val reader = Scanner(System.`in`)
    init {
       startGame()
    }

    private fun startGame(){
        val start = "------------------------------Welcome to Streak----------------------------\n" +
                "Click 1 for single game or 2 for two players"
        println(start)
        val gameToBePlayed = reader.nextInt()

        if (gameToBePlayed == 1){
            singlePlayerGame()
        }
    }

    private fun singlePlayerGame(){
        val name = "Enter yor name"
        val cards = "Enter number of playing cards"
        println(name)
        val playerName = reader.next()
        println(cards)
        val cardsToPlayWith = reader.nextInt()
        val player = PlayerHand(playerName, cardsToPlayWith)
        player.assignPlayingCards()
        player.sortCards()
        println(player.displayCards())
        println(player.getScore())
    }
}