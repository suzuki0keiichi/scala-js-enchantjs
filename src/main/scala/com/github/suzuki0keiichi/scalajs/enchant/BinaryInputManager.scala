package com.github.suzuki0keiichi.scalajs.enchant

import scala.scalajs.js.annotation.JSName
import scala.scalajs.js

@JSName("enchant.BinaryInputManager")
class BinaryInputManager(_flagStore: js.Object, _activeEventNameSuffix: String, _inactiveEventNameSuffix: String, _source: js.Object) extends InputManager(???, ???) {
  var activeEventNameSuffix: String = ???
  var activeInputsNum: Int = ???
  var inactiveEventNameSuffix: String = ???

  def bind(inputSource: BinaryInputSource, name: String) = sys.error("stub")

  def changeState(name: String, bool: Boolean) = sys.error("stub")

  def unbind(inputSource: BinaryInputSource) = sys.error("stub")
}
