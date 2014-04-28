package com.github.suzuki0keiichi.scalajs.enchant

import scala.scalajs.js.annotation.JSName
import scala.scalajs.js

@JSName("enchant.Entity")
class Entity() extends Node() {
  var backgroundColor: String = ???
  var buttonMode: String = ???
  var buttonPressed: Boolean = ???
  var compositeOperation: String = ???
  var debugColor: String = ???
  var height: Int = ???
  var opacity: Int = ???
  var originX: Int = ???
  var originY: Int = ???
  var rotation: Int = ???
  var scaleX: Int = ???
  var scaleY: Int = ???
  var touchEnabled: Boolean = ???
  var visible: Boolean = ???
  var width: Int = ???

  def disableCollection() = sys.error("stub")

  def enableCollection() = sys.error("stub")

  def intersect(other: js.Object): Boolean = sys.error("stub")

  def rotate(deg: Int) = sys.error("stub")

  def scale(x: Int, y: Int) = sys.error("stub")

  def within(other: js.Object, distance: Int): Boolean = sys.error("stub")
}
