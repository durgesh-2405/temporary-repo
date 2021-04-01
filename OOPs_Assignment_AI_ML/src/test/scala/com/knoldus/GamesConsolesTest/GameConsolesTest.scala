//OOPs Assignment of AI/Ml,Author - Durgesh Gupta
package com.knoldus.GamesConsolesTest

import com.knoldus.QuestionOne.GameConsole.GameConsole
import com.knoldus.QuestionOne.MediaFormat.{BluRayMediaFormat, CartridgeMediaFormat, DvdMediaFormat, USBMediaFormat}
import com.knoldus.QuestionOne.VideoResolution.{FHD, HD, UHD4K}
import org.scalatest.flatspec.AnyFlatSpec

import java.text.SimpleDateFormat
import java.util.Date

/*Here we are writing test cases to test the GameConsoles and the override toString method that we have defined
* in the Game Consoles Library.*/

class GameConsolesTest extends AnyFlatSpec {

  /* strToDate method is defined to convert the string to date.
  * */
  def strToDate(s: String): Date = {
    val format = new SimpleDateFormat("yyyy-MM-dd")
    format.parse(s)
  }
  val consoleOne = new GameConsole("Durgesh", "One", strToDate("2007-12-2 0:00 AM"), Some("a/b"),
    List(new CartridgeMediaFormat), new HD)

  "isString method for console one" should "be valid" in {
    val expectedResult = consoleOne.toString
    val actualResult = "GameConsole(Durgesh, One), max video resolution = com.knoldus.QuestionOne.VideoResolution.HD"
    assert(expectedResult == actualResult)
  }

  val consoleTwo = new GameConsole("Praanav", "Two", strToDate("2012-2-5 0:00 AM"), Some("a/b/g"),
    List(new DvdMediaFormat), new HD)


  "isString method for console two" should "be valid " in {
    val expectedResult = consoleTwo.toString
    val actualResult = "GameConsole(Praanav, Two), max video resolution = com.knoldus.QuestionOne.VideoResolution.HD"
    assert(expectedResult == actualResult)

  }

  val consoleThree = new GameConsole("Tanishka", "Three", strToDate("2014-3-3 0:00 AM"), Some("b/g/n"),
    List(new BluRayMediaFormat, new DvdMediaFormat), new FHD)

  "isString method for console three" should "be valid " in {
    val expectedResult = consoleThree.toString
    val actualResult = "GameConsole(Tanishka, Three), max video resolution = com.knoldus.QuestionOne.VideoResolution.FHD"
    assert(expectedResult == actualResult)

  }

  val consoleFour = new GameConsole("Nikhil", "Four", strToDate("2014-12-12 0:00 AM"), Some("g/n"),
    List(new USBMediaFormat), new UHD4K)

  "isString method for console FOur" should "be valid " in {
    val expectedResult = consoleFour.toString
    val actualResult = "GameConsole(Nikhil, Four), max video resolution = com.knoldus.QuestionOne.VideoResolution.UHD4K"
    assert(expectedResult == actualResult)

  }

  "isString method for console one" should "be invalid" in {
    val expectedResult = consoleOne.toString
    val actualResult = "GameConsole(Nikhil, Four), max video resolution = com.knoldus.QuestionOne.VideoResolution.UHD4K"
    assert(expectedResult != actualResult)
  }


}
