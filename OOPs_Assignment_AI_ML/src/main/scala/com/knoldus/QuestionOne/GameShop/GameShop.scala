//OOPs Assignment of AI/Ml,Author - Durgesh Gupta
package com.knoldus.QuestionOne.GameShop

import com.knoldus.QuestionOne.Game.Game
import com.knoldus.QuestionOne.GameConsole.GameConsole
import com.knoldus.QuestionOne.GameConsoleLibrary.GameConsoleLibrary

import scala.collection.MapView


/*Here we are creating an object class GameShop which contains the main method.
* In this class we have created objects of Game class that contains the information of games like name of game, maker, and supported consoles.
* and we have created the object of GameConsoleLibrary and it contains method to sort the list of games.
* */

object GameShop extends App {

  /* Creating an object of GameConsoleLibrary class.
  * */
  val gameConsoles = new GameConsoleLibrary()

  /*Here are are creating objects of Game Class that stores the information about games.
  * */
  val gameOne = new Game("GTA Five", "Rockstar Games", List(gameConsoles.consoleOne))
  val gameTwo = new Game("Resident Evil", "Nex Enterprise", List(gameConsoles.consoleOne, gameConsoles.consoleTwo))
  val gameThree = new Game("AngryBirds", "GameLoft", List(gameConsoles.consoleThree, gameConsoles.consoleFour))



  /* Creating the list of games */
  val listOfGames = List(gameOne,gameTwo,gameThree)

  /*Mapping of different consoles to there respective supported consoles.
  * */
  val consoleToGames: Any = {
    val consoleToGames1: List[(GameConsole, Game)] = listOfGames flatMap (g => g.consoles.map(c => c -> g))
    val consoleToGames2: Map[GameConsole, List[(GameConsole, Game)]] = consoleToGames1 groupBy (_._1)
    val consoleToGames3: MapView[GameConsole, List[Game]] = consoleToGames2 mapValues (_ map (_._2))
    consoleToGames3
  }

  /* Here we are defining a method sortingGames  which will sort the list of games.
  * and print it.
  * */
  def sortingGames(): Unit = {
    listOfGames sortBy (g => s"${g.maker}_${g.name}") foreach { game =>
      val consoleInfo = game.consoles.map(c => s"${c.maker} ${c.model}").mkString(", ")
      print(s"Game Name: ${game.name} by ${game.maker} for game consoles: $consoleInfo \n")
    }
  }
  /* Calling the sorting function.
  * */
  sortingGames()


}
