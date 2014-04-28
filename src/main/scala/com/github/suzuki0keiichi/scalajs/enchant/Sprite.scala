package com.github.suzuki0keiichi.scalajs.enchant

import scala.scalajs.js.annotation.JSName
import scala.scalajs.js

@JSName("enchant.Sprite")
class Sprite(_width: Int, _height: Int) extends Entity() {
  var frame: js.Array[js.Any] = ???
  var image: Surface = ???
}
