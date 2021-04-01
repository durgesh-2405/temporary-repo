//OOPs Assignment of AI/Ml,Author - Durgesh Gupta
package com.knoldus.QuestionOne.VideoResolution


/* Here we are defining an abstract class VideoResolution containing pixels as
* parameter.
* */
abstract  class VideoResolution(pixels: Int)

/* Here we have created Four classes HD, FHD, QHD, and UHD4K that extends the abstract class VideoResolution with pixes as the parameter.
* */

class HD extends VideoResolution(1280 * 720)
class FHD extends VideoResolution(1920 * 1080)
class QHD extends VideoResolution(2560 * 1440)
class UHD4K extends VideoResolution(3840 * 2160)
