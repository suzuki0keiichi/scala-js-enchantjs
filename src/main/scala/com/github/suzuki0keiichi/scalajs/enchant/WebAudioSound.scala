package com.github.suzuki0keiichi.scalajs.enchant

import scala.scalajs.js.annotation.JSName
import scala.scalajs.js

@JSName("enchant.WebAudioSound")
object WebAudioSound extends js.Object {

  def load(src: String, `type`: String, callback: js.Function0[js.Object], onerror: js.Function0[js.Object]): WebAudioSound = sys.error("stub")
}

@JSName("enchant.WebAudioSound")
class WebAudioSound() extends EventTarget() {
  var currentTime: Int = ???
  var duration: Int = ???
  var volume: Int = ???

  override def clone(): WebAudioSound = sys.error("stub")

  def pause() = sys.error("stub")

  def play(dup: Boolean) = sys.error("stub")

  def stop() = sys.error("stub")
}
