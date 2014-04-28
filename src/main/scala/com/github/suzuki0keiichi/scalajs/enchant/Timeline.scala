package com.github.suzuki0keiichi.scalajs.enchant

import scala.scalajs.js.annotation.JSName
import scala.scalajs.js

@JSName("enchant.Timeline")
class Timeline(_node: Node) extends EventTarget() {

  def action(params: js.Object): Timeline = sys.error("stub")

  def add(action: Action): Timeline = sys.error("stub")

  def and(): Timeline = sys.error("stub")

  def clear(): Timeline = sys.error("stub")

  def cue(cue: js.Object): Timeline = sys.error("stub")

  def delay(time: Int): Timeline = sys.error("stub")

  def exec(func: js.Function0[js.Object]): Timeline = sys.error("stub")

  def fadeIn(time: Int, easing: js.Function0[js.Object]): Timeline = sys.error("stub")

  def fadeOut(time: Int, easing: js.Function0[js.Object]): Timeline = sys.error("stub")

  def fadeTo(opacity: Int, time: Int, easing: js.Function0[js.Object]): Timeline = sys.error("stub")

  def hide(): Timeline = sys.error("stub")

  def loop(): Timeline = sys.error("stub")

  def moveBy(x: Int, y: Int, time: Int, easing: js.Function0[js.Object]): Timeline = sys.error("stub")

  def moveTo(x: Int, y: Int, time: Int, easing: js.Function0[js.Object]): Timeline = sys.error("stub")

  def moveX(x: Int, time: Int, easing: js.Function0[js.Object]): Timeline = sys.error("stub")

  def moveY(y: Int, time: Int, easing: js.Function0[js.Object]): Timeline = sys.error("stub")

  def next() = sys.error("stub")

  def pause(): Timeline = sys.error("stub")

  def removeFromScene(): Timeline = sys.error("stub")

  def repeat(func: js.Function0[js.Object], time: Int): Timeline = sys.error("stub")

  def resume(): Timeline = sys.error("stub")

  def rotateBy(deg: Int, time: Int, easing: js.Function0[js.Object]): Timeline = sys.error("stub")

  def rotateTo(deg: Int, time: Int, easing: js.Function0[js.Object]): Timeline = sys.error("stub")

  def scaleBy(scaleX: Int, scaleY: Int, time: Int, easing: js.Function0[js.Object]): Timeline = sys.error("stub")

  def scaleTo(scaleX: Int, scaleY: Int, time: Int, easing: js.Function0[js.Object]): Timeline = sys.error("stub")

  def setFrameBased() = sys.error("stub")

  def setTimeBased() = sys.error("stub")

  def show(): Timeline = sys.error("stub")

  def skip(frames: Int): Timeline = sys.error("stub")

  def then(func: js.Function0[js.Object]): Timeline = sys.error("stub")

  def tick(enterFrameEvent: Event) = sys.error("stub")

  def tween(params: js.Object): Timeline = sys.error("stub")

  def unloop(): Timeline = sys.error("stub")

  def waitUntil(func: js.Function0[js.Object]): Timeline = sys.error("stub")
}
