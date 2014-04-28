package com.github.suzuki0keiichi.scalajs.enchant

import scala.scalajs.js.annotation.JSName
import scala.scalajs.js

@JSName("enchant.KeyboardInputSource")
object KeyboardInputSource extends js.Object {

  def getByKeyCode(keyCode: Int): KeyboardInputSource = sys.error("stub")
}

@JSName("enchant.KeyboardInputSource")
class KeyboardInputSource(_keyCode: String) extends BinaryInputSource(???) {
}
