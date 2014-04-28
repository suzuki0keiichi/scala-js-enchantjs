package com.github.suzuki0keiichi.scalajs.enchant

import scala.scalajs.js.annotation.JSName
import scala.scalajs.js

@JSName("enchant.Surface")
object Surface extends js.Object {

  def load(src: String, callback: js.Function0[js.Object], onerror: js.Function0[js.Object]): Surface = sys.error("stub")
}

@JSName("enchant.Surface")
class Surface(_width: Int, _height: Int) extends EventTarget() {
  var context: org.scalajs.dom.CanvasRenderingContext2D = ???
  var height: Int = ???
  var width: Int = ???

  def clear() = sys.error("stub")

  override def clone(): Surface = sys.error("stub")

  def draw(image: Surface) = sys.error("stub")

  def getPixel(x: Int, y: Int): js.Array[Int] = sys.error("stub")

  def setPixel(x: Int, y: Int, r: Int, g: Int, b: Int, a: Int) = sys.error("stub")

  def toDataURL(): String = sys.error("stub")
}
