package com.github.suzuki0keiichi.scalajs.enchant

import scala.scalajs.js.annotation.JSName
import scala.scalajs.js

@JSName("enchant.Map")
class Map(_tileWidth: Int, _tileHeight: Int) extends Entity() {
  var collisionData: js.Array[Int] = ???
  var image: Surface = ???
  var tileHeight: Int = ???
  var tileWidth: Int = ???

  def checkTile(x: Int, y: Int): js.Object = sys.error("stub")

  def hitTest(x: Int, y: Int): Boolean = sys.error("stub")

  def loadData(data: js.Array[Int]*) = sys.error("stub")
}
