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
        }else{
            twoPlayerGame()
        }
    }

    private fun singlePlayerGame(){
        val name = "Enter your name"
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

    private fun twoPlayerGame(){
        val name = "Enter player one name"
        val cards = "Enter number of playing cards(5-10)"
        val name2 = "Enter player two name"

        println(name)

        val playerOneName = reader.next()
        println(cards)
        var cardsToPlayWith = reader.nextInt()

        if (cardsToPlayWith < 5 || cardsToPlayWith > 10){
            println("cards should be more than 5 and less than 10")
            println(cards)
            cardsToPlayWith = reader.nextInt()
        }
        println(name2)
        val playerTwoName = reader.next()

        //creating an instance of the first player
        val playerOne = PlayerHand(playerOneName, cardsToPlayWith)
        playerOne.assignPlayingCards()
        playerOne.sortCards()
        println(playerOne.displayCards())
        println(playerOne.getScore())

        //creating an instance of the second player
        val playerTwo = PlayerHand(playerTwoName, cardsToPlayWith)
        playerTwo.assignPlayingCards()
        playerTwo.sortCards()
        println(playerTwo.displayCards())
        println(playerTwo.getScore())

    }

    private fun dropCard(){
        val name = "Enter "
    }
}