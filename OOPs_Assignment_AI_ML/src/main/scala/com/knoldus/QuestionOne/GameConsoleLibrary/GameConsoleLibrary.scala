package com.knoldus.QuestionOne.GameConsoleLibrary

import com.knoldus.QuestionOne.GameConsole.GameConsole
import com.knoldus.QuestionOne.MediaFormat.{BluRayMediaFormat, CartridgeMediaFormat, DvdMediaFormat, USBMediaFormat}
import com.knoldus.QuestionOne.VideoResolution.{FHD, HD, UHD4K}

import java.text.SimpleDateFormat
import java.util.Date

class GameConsoleLibrary {

  def strToDate(s: String): Date = {
    val format = new SimpleDateFormat("yyyy-MM-dd")
    format.parse(s)
  }
  val chanduOne = new GameConsole("Chandu", "One", strToDate("2007-12-2 0:00 AM"), Some("a/b"),
    List(new CartridgeMediaFormat), new HD)
  print(chanduOne.toString + "\n")

  val aquaTopia = new GameConsole("Aqua", "Topia", strToDate("2012-2-5 0:00 AM"), Some("a/b/g"),
    List(new DvdMediaFormat), new HD)

  val oonaSeven = new GameConsole("Oona", "Seven", strToDate("2014-3-3 0:00 AM"), Some("b/g/n"),
    List(new BluRayMediaFormat, new DvdMediaFormat), new FHD)

  val leoChallenge = new GameConsole("Leonardo", "Challenge", strToDate("2014-12-12 0:00 AM"), Some("g/n"),
    List(new USBMediaFormat), new UHD4K)

}
