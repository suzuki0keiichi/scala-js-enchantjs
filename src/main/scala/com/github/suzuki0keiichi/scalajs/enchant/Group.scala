package com.github.suzuki0keiichi.scalajs.enchant

import scala.scalajs.js.annotation.JSName
import scala.scalajs.js

@JSName("enchant.Group")
class Group() extends Node() {
  var childNodes: js.Array[Node] = ???
  var firstChild: Node = ???
  var lastChild: Node = ???
  var originX: Int = ???
  var originY: Int = ???
  var rotation: Int = ???
  var scaleX: Int = ???
  var scaleY: Int = ???

  def addChild(node: Node) = sys.error("stub")

  def insertBefore(node: Node, reference: Node) = sys.error("stub")

  def removeChild(node: Node) = sys.error("stub")
}
