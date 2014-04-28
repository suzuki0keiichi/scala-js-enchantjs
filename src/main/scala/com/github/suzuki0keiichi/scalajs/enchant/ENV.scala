package com.github.suzuki0keiichi.scalajs.enchant

import scala.scalajs.js.annotation.JSName
import scala.scalajs.js

@JSName("enchant.ENV")
class ENV() extends js.Object {
  var BROWSER: String = ???
  var CANVAS_DRAWING_METHODS: js.Array[String] = ???
  var KEY_BIND_TABLE: js.Object = ???
  var PREVENT_DEFAULT_KEY_CODES: js.Array[Int] = ???
  var RETINA_DISPLAY: Boolean = ???
  var SOUND_ENABLED_ON_MOBILE_SAFARI: Boolean = ???
  var TOUCH_ENABLED: Boolean = ???
  var USE_ANIMATION: Boolean = ???
  var USE_DEFAULT_EVENT_TAGS: js.Array[String] = ???
  var USE_FLASH_SOUND: Boolean = ???
  var USE_WEBAUDIO: Boolean = ???
  var VENDOR_PREFIX: String = ???
  var VERSION: String = ???
}
