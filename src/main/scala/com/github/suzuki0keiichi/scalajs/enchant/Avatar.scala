package com.github.suzuki0keiichi.scalajs.enchant

import scala.scalajs.js.annotation.JSName
import scala.scalajs.js

@JSName("enchant.avatar.Avatar")
class Avatar(_code: String) extends avatar.AvatarCharacter() {

  def getCode(): String = sys.error("stub")

  def loadImage() = sys.error("stub")

  def setCode(code: String) = sys.error("stub")
}
