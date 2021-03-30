package com.knoldus.QuestionOne.VideoResolution

abstract  class VideoResolution(pixels: Int)

class HD extends VideoResolution(1280 * 720)
class FHD extends VideoResolution(1920 * 1080)
class QHD extends VideoResolution(2560 * 1440)
class UHD4K extends VideoResolution(3840 * 2160)
