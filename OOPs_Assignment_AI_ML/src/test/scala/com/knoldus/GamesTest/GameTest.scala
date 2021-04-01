//OOPs Assignment of AI/Ml,Author - Durgesh Gupta
package com.knoldus.GamesTest

import com.knoldus.QuestionOne.Game.Game
import com.knoldus.QuestionOne.GameConsoleLibrary.GameConsoleLibrary
import org.scalatest.flatspec.AnyFlatSpec

/* Here we are writing unit test cases to test the game and there supported consoles using the
* isSupported method and the overridden isString method.
* */
class GameTest extends AnyFlatSpec{

  val consoles = new GameConsoleLibrary()
  val gameOne = new Game("GTA Five", "Rockstar Games", List(consoles.consoleOne))
  val gameTwo = new Game("Resident Evil", "Nex Enterprise", List(consoles.consoleOne, consoles.consoleTwo))
  val gameThree = new Game("AngryBirds", "GameLoft", List(consoles.consoleThree, consoles.consoleFour))
  val gameFour = new Game("PUBG","Tencent Games", List(consoles.consoleOne,consoles.consoleTwo,consoles.consoleThree,consoles.consoleFour))

  /*Here we are writing unit test cases to test the isSupported method to test that the given game
  * supports the console or not.
  * */
  "gameOne " should "be valid and support consoleOne will not support other consoles" in {
    val expectedResultForConsoleOne = gameOne.isSupported(consoles.consoleOne)
    val expectedResultForConsoleTwo = gameOne.isSupported(consoles.consoleTwo)
    val expectedResultForConsoleThree = gameOne.isSupported(consoles.consoleThree)
    val expectedResultForConsoleFour = gameOne.isSupported(consoles.consoleFour)
    assert(expectedResultForConsoleOne)
    assert(!expectedResultForConsoleTwo)
    assert(!expectedResultForConsoleThree)
    assert(!expectedResultForConsoleFour)
  }

  "gameTwo " should "be valid and support consoleOne and consoleTwo will not support other consoles" in {
    val expectedResultForConsoleOne = gameTwo.isSupported(consoles.consoleOne)
    val expectedResultForConsoleTwo = gameTwo.isSupported(consoles.consoleTwo)
    val expectedResultForConsoleThree = gameTwo.isSupported(consoles.consoleThree)
    val expectedResultForConsoleFour = gameTwo.isSupported(consoles.consoleFour)
    assert(expectedResultForConsoleOne)
    assert(expectedResultForConsoleTwo)
    assert(!expectedResultForConsoleThree)
    assert(!expectedResultForConsoleFour)
  }

  "gameThree " should "be valid and support consoleThree and consoleFour will not support other consoles" in {
    val expectedResultForConsoleOne = gameThree.isSupported(consoles.consoleOne)
    val expectedResultForConsoleTwo = gameThree.isSupported(consoles.consoleTwo)
    val expectedResultForConsoleThree = gameThree.isSupported(consoles.consoleThree)
    val expectedResultForConsoleFour = gameThree.isSupported(consoles.consoleFour)
    assert(!expectedResultForConsoleOne)
    assert(!expectedResultForConsoleTwo)
    assert(expectedResultForConsoleThree)
    assert(expectedResultForConsoleFour)
  }

  "gameFour " should "be valid and support all consoles " in {
    val expectedResultForConsoleOne = gameFour.isSupported(consoles.consoleOne)
    val expectedResultForConsoleTwo = gameFour.isSupported(consoles.consoleTwo)
    val expectedResultForConsoleThree = gameFour.isSupported(consoles.consoleThree)
    val expectedResultForConsoleFour = gameFour.isSupported(consoles.consoleFour)
    assert(expectedResultForConsoleOne)
    assert(expectedResultForConsoleTwo)
    assert(expectedResultForConsoleThree)
    assert(expectedResultForConsoleFour)
  }

  "gameOne " should "be invalid if it support other consoles except consoleOne " in {
    val expectedResultForConsoleOne = gameOne.isSupported(consoles.consoleOne)
    val actualResultForConsoleOne = false
    val expectedResultForConsoleTwo = gameOne.isSupported(consoles.consoleTwo)
    val actualResultForConsoleTwo = true
    val expectedResultForConsoleThree = gameOne.isSupported(consoles.consoleThree)
    val actualResultForConsoleThree = true
    val expectedResultForConsoleFour = gameOne.isSupported(consoles.consoleFour)
    val actualResultForConsoleFour = true
    assert(expectedResultForConsoleOne != actualResultForConsoleOne)
    assert(expectedResultForConsoleTwo != actualResultForConsoleTwo )
    assert(expectedResultForConsoleThree != actualResultForConsoleThree)
    assert(expectedResultForConsoleFour != actualResultForConsoleFour)
  }

  /*Here we are writing unit test cases to test the overridden toString method to test that the given game
  * supports the console or not.
  * */


  "toString method " should "valid for gameOne " in {
    val expectedResult = gameOne.toString
    val actualResult = "Game(Name: GTA Five, by Rockstar Games)"
    assert(expectedResult == actualResult)
  }

  "toString method " should "valid for gameTwo " in {
    val expectedResult = gameTwo.toString
    val actualResult = "Game(Name: Resident Evil, by Nex Enterprise)"
    assert(expectedResult == actualResult)
  }

  "toString method " should "valid for gameThree " in {
    val expectedResult = gameThree.toString
    val actualResult = "Game(Name: AngryBirds, by GameLoft)"
    assert(expectedResult == actualResult)
  }

  "toString method " should "valid for gameFour " in {
    val expectedResult = gameFour.toString
    val actualResult = "Game(Name: PUBG, by Tencent Games)"
    assert(expectedResult == actualResult)
  }


  "toString method " should "invalid for gameOne " in {
    val expectedResult = gameOne.toString
    val actualResult = "Game(Name: GTA Five, by GameLoft)"
    assert(expectedResult != actualResult)
  }






}
