//OOPs Assignment of AI/Ml,Author - Durgesh Gupta
package com.knoldus.QuestionOne.GameConsoleLibrary

import com.knoldus.QuestionOne.GameConsole.GameConsole
import com.knoldus.QuestionOne.MediaFormat.{BluRayMediaFormat, CartridgeMediaFormat, DvdMediaFormat, USBMediaFormat}
import com.knoldus.QuestionOne.VideoResolution.{FHD, HD, UHD4K}

import java.text.SimpleDateFormat
import java.util.Date

/* Here we are creating a class GameConsoleLibrary that contains a strToDate method and objects of Game console class.
* This class stores the information of the Game consoles like maker name, model, date of release, the consoles are wifi
* enabled or not, supported media format, and video resolution.
* */
class GameConsoleLibrary {

  /*Here we are creating a method that will convert the string into date.*/
  def strToDate(s: String): Date = {
    val format = new SimpleDateFormat("yyyy-MM-dd")
    format.parse(s)
  }

  /*Here are are creating objects of GameConsole that stores the information about the game consoles.
   */
  val consoleOne = new GameConsole("Durgesh", "One", strToDate("2007-12-2 0:00 AM"), Some("a/b"),
    List(new CartridgeMediaFormat), new HD)

  val consoleTwo = new GameConsole("Praanav", "Two", strToDate("2012-2-5 0:00 AM"), Some("a/b/g"),
    List(new DvdMediaFormat), new HD)


  val consoleThree = new GameConsole("Tanishka", "Three", strToDate("2014-3-3 0:00 AM"), Some("b/g/n"),
    List(new BluRayMediaFormat, new DvdMediaFormat), new FHD)

  val consoleFour = new GameConsole("Nikhil", "Four", strToDate("2014-12-12 0:00 AM"), Some("g/n"),
    List(new USBMediaFormat), new UHD4K)


}
