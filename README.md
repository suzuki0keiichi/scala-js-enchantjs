scala-js-enchantjs
============

Scala.jsでenchant.jsを使えるようにするためのstub。
enchant.jsサイトトップに有るサンプルをこのstubと合わせて書くと以下の用になります。

```scala
import scala.scalajs.js
import scala.scalajs.js.annotation.JSExport
import com.github.suzuki0keiichi.scalajs.enchant._

@JSExport
object ScalaJSExample {
  @JSExport
  def main(): Unit = {
    enchant()

    val game = new Core(320, 320)

    game.preload(js.Array("chara1.png"))
    game.fps = 20
    game.onload = {
      () =>
        val bear = new Sprite(32, 32)

        bear.image = game.assets.asInstanceOf[js.Dictionary[Surface]]("chara1.png")
        game.rootScene.addChild(bear)
        bear.frame = js.Array(6, 6, 7, 7) // select sprite frame

        bear.tl.moveBy(288, 0, 90, null) // move right
          .scaleTo(-1, 1, 10, null) // turn left
          .moveBy(-288, 0, 90, null) // move left
          .scaleTo(1, 1, 10, null) // turn right
          .loop()
    }

    game.start()
  }
}
```

注意点
----------

- static相当のフィールド、関数を持つstub向けゴミコードが残っています
- enchant.jsのドキュメント(.html)から自動で生成するようにしています
 - (出来ればScala.js自体に自動でstub生成を行う機能が付いて欲しい)
 - そのうちそちらもgithubに上げます
- 複数の型が指定できる部分では、一番手前に指定されている型を使用します

License
-------

Documentation marked "MDN" is thanks to Mozilla Contributors
at https://developer.mozilla.org/en-US/docs/Web/API and available
under the Creative Commons Attribution-ShareAlike v2.5 or later.
http://creativecommons.org/licenses/by-sa/2.5/

This should not affect you, as a user of the library, as long as you don't
modify these MDN materials (e.g. you leave them as is, or replace them
wholesale). In particular, packaging this library with MDN materials unchanged
is fine for any purpose (including commercial) according to the
CC-Attribute-ShareAlike License.

Everything else (e.g. the code) is under the MIT License

The MIT License (MIT)

Copyright (c) 2013 Li Haoyi

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
