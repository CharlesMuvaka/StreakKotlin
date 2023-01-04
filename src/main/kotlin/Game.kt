import java.util.Scanner

class Game {
    init {
       startGame()
    }

    private fun startGame(){
        val reader = Scanner(System.`in`)
        val start = "------------------------------Welcome to Streak----------------------------\n" +
                "Click 1 for single game or 2 for two players"
        println(start)
        val gameToBePlayed = reader.nextInt()
        println(gameToBePlayed)
    }
}