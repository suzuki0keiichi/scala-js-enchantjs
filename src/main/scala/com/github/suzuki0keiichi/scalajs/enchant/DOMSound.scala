package com.github.suzuki0keiichi.scalajs.enchant

import scala.scalajs.js.annotation.JSName
import scala.scalajs.js

@JSName("enchant.DOMSound")
object DOMSound extends js.Object {

  def load(src: String, `type`: String, callback: js.Function0[js.Object], onerror: js.Function0[js.Object]): DOMSound = sys.error("stub")
}

@JSName("enchant.DOMSound")
class DOMSound() extends EventTarget() {
  var currentTime: Int = ???
  var duration: Int = ???
  var volume: Int = ???

  override def clone(): DOMSound = sys.error("stub")

  def pause() = sys.error("stub")

  def play() = sys.error("stub")

  def stop() = sys.error("stub")
}
