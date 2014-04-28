package com.github.suzuki0keiichi.scalajs.enchant

import scala.scalajs.js.annotation.JSName
import scala.scalajs.js

@JSName("enchant.EventTarget")
class EventTarget() extends js.Object {

  def addEventListener(`type`: String, listener: js.Function1[Event, js.Object]) = sys.error("stub")

  def clearEventListener(`type`: String) = sys.error("stub")

  def dispatchEvent(e: Event) = sys.error("stub")

  def on(`type`: String, listener: js.Function1[Event, js.Object]) = sys.error("stub")

  def removeEventListener(`type`: String, listener: js.Function1[Event, js.Object]) = sys.error("stub")
}
