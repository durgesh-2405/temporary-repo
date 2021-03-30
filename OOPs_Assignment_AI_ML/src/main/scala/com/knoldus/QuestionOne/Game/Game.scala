package com.knoldus.QuestionOne.Game

import com.knoldus.QuestionOne.GameConsole.GameConsole

class Game (val name: String, val maker: String, val consoles: List[GameConsole]) {
  def isSupported(console: GameConsole): Boolean = {
    consoles contains console
  }

  override def toString = s"Game($name, by $maker)"

}