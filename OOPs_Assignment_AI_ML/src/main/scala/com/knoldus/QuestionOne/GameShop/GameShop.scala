package com.knoldus.QuestionOne.GameShop

import com.knoldus.QuestionOne.Game.Game
import com.knoldus.QuestionOne.GameConsole.GameConsole
import com.knoldus.QuestionOne.GameConsoleLibrary.GameConsoleLibrary
import com.knoldus.QuestionOne.MediaFormat.CartridgeMediaFormat
import com.knoldus.QuestionOne.VideoResolution.HD

import java.text.SimpleDateFormat
import java.util.Date
import scala.collection.MapView



object GameShop extends App {

  val consoles = new GameConsoleLibrary()
  val one = new Game("Elevator Action", "Taito", List(consoles.chanduOne))
  //new Game("Elevator Action", "Taito", List(consoles.chanduOne))
  val two = new Game("Mappy", "Namco", List(consoles.chanduOne, consoles.aquaTopia))
  val three = new Game("StreetFigher", "Capcom", List(consoles.oonaSeven, consoles.leoChallenge))

  def strToDate(s: String): Date = {
    val format = new SimpleDateFormat("yyyy-MM-dd")
    format.parse(s)
  }
  val chanduOne = new GameConsole("Chandu", "One", strToDate("2007-12-2 0:00 AM"), Some("a/b"),
    List(new CartridgeMediaFormat), new HD)

  print(one.isSupported(consoles.chanduOne) + "\n")

  val games = List(one,two,three)
  print(one.toString + "\n")

  val consoleToGames: Any = {
    val consoleToGames1: List[(GameConsole, Game)] = games flatMap (g => g.consoles.map(c => c -> g))
    val consoleToGames2: Map[GameConsole, List[(GameConsole, Game)]] = consoleToGames1 groupBy (_._1)
    val consoleToGames3: MapView[GameConsole, List[Game]] = consoleToGames2 mapValues (_ map (_._2))
    consoleToGames3
  }

  def reportGames(): Unit = {
    games sortBy (g => s"${g.maker}_${g.name}") foreach { game =>
      val consoleInfo = game.consoles.map(c => s"${c.make} ${c.model}").mkString(", ")
      println(s"${game.name} by ${game.maker} for $consoleInfo")
    }
  }

  reportGames()


}
