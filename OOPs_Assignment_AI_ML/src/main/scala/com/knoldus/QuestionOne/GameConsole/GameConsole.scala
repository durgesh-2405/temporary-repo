package com.knoldus.QuestionOne.GameConsole

import com.knoldus.QuestionOne.MediaFormat.MediaFormat
import com.knoldus.QuestionOne.VideoResolution.VideoResolution

import java.util.Date

class GameConsole (val make: String, val model: String, val debut: Date, val wifiType: Option[String],
                   val mediaFormats: List[MediaFormat], val maxVideoResolution: VideoResolution){

  override def toString = s"GameConsole($make, $model), max video resolution = ${maxVideoResolution.getClass.getName}"

}
