package com.github.suzuki0keiichi.scalajs.enchant

import scala.scalajs.js.annotation.JSName
import scala.scalajs.js

@JSName("enchant.InputSource")
class InputSource(_identifier: String) extends EventTarget() {
  var identifier: String = ???

  def notifyStateChange(data: js.Object) = sys.error("stub")
}
