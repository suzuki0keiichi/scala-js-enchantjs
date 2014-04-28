package com.github.suzuki0keiichi.scalajs.enchant

import scala.scalajs.js.annotation.JSName
import scala.scalajs.js

@JSName("enchant.Core")
object Core extends js.Object {

  def findExt(path: String): js.Object = sys.error("stub")

  def initialize() = sys.error("stub")
}

@JSName("enchant.Core")
class Core(_width: Int, _height: Int) extends EventTarget() {
  var assets: js.Object = ???
  var currentScene: Scene = ???
  var fps: Int = ???
  var frame: Int = ???
  var height: Int = ???
  var input: js.Object = ???
  var instance: Core = ???
  var loadingScene: Scene = ???
  var ready: Boolean = ???
  var rootScene: Scene = ???
  var running: Boolean = ???
  var scale: Int = ???
  var width: Int = ???
  var onload: js.Function0[js.Object] = ???

  def debug(): Deferred = sys.error("stub")

  def getElapsedTime(): Int = sys.error("stub")

  def keybind(key: Int, button: String): Core = sys.error("stub")

  def keyunbind(key: Int): Core = sys.error("stub")

  def load(src: String, alias: String, callback: js.Function0[js.Object], onerror: js.Function0[js.Object]): Deferred = sys.error("stub")

  def pause() = sys.error("stub")

  def popScene(): Scene = sys.error("stub")

  def preload(assets: js.Array[String]): Core = sys.error("stub")

  def pushScene(scene: Scene): Scene = sys.error("stub")

  def removeScene(scene: Scene): Scene = sys.error("stub")

  def replaceScene(scene: Scene): Scene = sys.error("stub")

  def resume() = sys.error("stub")

  def start(): Deferred = sys.error("stub")

  def stop() = sys.error("stub")

  def transitionPop(): Scene = sys.error("stub")

  def transitionPush(scene: Scene): Scene = sys.error("stub")
}
