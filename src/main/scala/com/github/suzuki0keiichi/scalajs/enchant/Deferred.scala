package com.github.suzuki0keiichi.scalajs.enchant

import scala.scalajs.js.annotation.JSName
import scala.scalajs.js

@JSName("enchant.Deferred")
object Deferred extends js.Object {

  def next(func: js.Function0[js.Object]): Deferred = sys.error("stub")

  def parallel(arg: js.Array[Deferred]): Deferred = sys.error("stub")
}

@JSName("enchant.Deferred")
class Deferred() extends js.Object {

  def call(arg: js.Object) = sys.error("stub")

  def error(func: js.Function0[js.Object]) = sys.error("stub")

  def fail(arg: js.Object) = sys.error("stub")

  def next(func: js.Function0[js.Object]) = sys.error("stub")
}
