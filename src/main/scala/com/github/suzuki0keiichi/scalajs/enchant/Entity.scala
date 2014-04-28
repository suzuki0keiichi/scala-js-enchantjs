package com.github.suzuki0keiichi.scalajs.enchant

import scala.scalajs.js.annotation.JSName
import scala.scalajs.js

@JSName("enchant.Entity")
object Entity extends js.Object {

  def alignBottomIn(another: js.Object, margin: Int) = sys.error("stub")

  def alignBottomOf(another: js.Object, margin: Int) = sys.error("stub")

  def alignHorizontalCenterIn(another: js.Object, margin: Int) = sys.error("stub")

  def alignLeftIn(another: js.Object, margin: Int) = sys.error("stub")

  def alignLeftOf(another: js.Object, margin: Int) = sys.error("stub")

  def alignRightIn(another: js.Object, margin: Int) = sys.error("stub")

  def alignRightOf(another: js.Object, margin: Int) = sys.error("stub")

  def alignTopIn(another: js.Object, margin: Int) = sys.error("stub")

  def alignTopOf(another: js.Object, margin: Int) = sys.error("stub")

  def alignVerticalCenterIn(another: js.Object, margin: Int) = sys.error("stub")
}

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
