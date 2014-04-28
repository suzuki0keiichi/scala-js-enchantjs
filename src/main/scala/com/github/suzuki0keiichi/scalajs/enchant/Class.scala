package com.github.suzuki0keiichi.scalajs.enchant

import scala.scalajs.js.annotation.JSName
import scala.scalajs.js

@JSName("enchant.Class")
object Class extends js.Object {

  def applyMixingRecipe(target: js.Function0[js.Object], source: _class.MixingRecipe): js.Function0[js.Object] = sys.error("stub")

  def create(superclass: js.Function0[js.Object], definition: js.Object) = sys.error("stub")

  def getInheritanceTree(constructor: js.Object): js.Array[js.Function0[js.Object]] = sys.error("stub")

  def mixClasses(firstClass: js.Function0[js.Object], sourceClass: js.Function0[js.Object]): js.Function0[js.Object] = sys.error("stub")

  def mixClassesFromRecipe(firstClass: js.Function0[js.Object], sourceClass: js.Function0[js.Object], recipe: _class.MixingRecipe): js.Function0[js.Object] = sys.error("stub")
}

@JSName("enchant.Class")
class Class(_superclass: js.Function0[js.Object], _definition: js.Object) extends js.Object {
}
