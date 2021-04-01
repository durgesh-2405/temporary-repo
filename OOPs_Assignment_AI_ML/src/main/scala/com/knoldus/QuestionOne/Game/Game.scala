//OOPs Assignment of AI/Ml,Author - Durgesh Gupta
package com.knoldus.QuestionOne.Game

import com.knoldus.QuestionOne.GameConsole.GameConsole


/*Here we are defining a class Game that contains two methods isSupported and overridden toString.
* */
class Game (val name: String, val maker: String, val consoles: List[GameConsole]) {
  /* Here we are defining isSupported method that will return true if the game support that console
  * otherwise false.
  * */
  def isSupported(console: GameConsole): Boolean = {
    consoles contains console
  }

  /* Here we are overriding the toString method and it will return a string that contains name
  * of the game and its maker.
  * */
  override def toString: String = s"Game(Name: $name, by $maker)"

}
