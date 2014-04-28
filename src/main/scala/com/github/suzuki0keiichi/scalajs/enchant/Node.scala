package com.github.suzuki0keiichi.scalajs.enchant

import scala.scalajs.js.annotation.JSName
import scala.scalajs.js

@JSName("enchant.Node")
class Node() extends EventTarget() {
  var age: Int = ???
  var parentNode: Group = ???
  var scene: Scene = ???
  var x: Int = ???
  var y: Int = ???
  var tl: Timeline = ???

  def moveBy(x: Int, y: Int) = sys.error("stub")

  def moveTo(x: Int, y: Int) = sys.error("stub")
}
