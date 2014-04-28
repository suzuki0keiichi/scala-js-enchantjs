package com.github.suzuki0keiichi.scalajs.enchant

import scala.scalajs.js.annotation.JSName
import scala.scalajs.js

@JSName("enchant.InputManager")
class InputManager(_valueStore: js.Object, _source: js.Object) extends EventTarget() {
  var broadcastTarget: js.Array[EventTarget] = ???
  var source: js.Object = ???
  var valueStore: js.Object = ???

  def addBroadcastTarget(eventTarget: EventTarget) = sys.error("stub")

  def bind(inputSource: InputSource, name: String) = sys.error("stub")

  def broadcastEvent(e: Event) = sys.error("stub")

  def changeState(name: String, data: js.Object) = sys.error("stub")

  def removeBroadcastTarget(eventTarget: EventTarget) = sys.error("stub")

  def unbind(inputSource: InputSource) = sys.error("stub")
}
