//OOPs Assignment of AI/Ml,Author - Durgesh Gupta
package com.knoldus.QuestionOne.GameConsole

import com.knoldus.QuestionOne.MediaFormat.MediaFormat
import com.knoldus.QuestionOne.VideoResolution.VideoResolution

/* Here we are creating a class GameConsole which contains overridden method of toString.
* */
import java.util.Date

class GameConsole (val maker: String, val model: String, val debut: Date, val wifiType: Option[String],
                   val mediaFormats: List[MediaFormat], val maxVideoResolution: VideoResolution){


  /* Here we are overriding the toString method that will return a string containing
  * information about the maker, model and the maximum video resolution
  * */
  override def toString: String = s"GameConsole($maker, $model), max video resolution = ${maxVideoResolution.getClass.getName}"

}
