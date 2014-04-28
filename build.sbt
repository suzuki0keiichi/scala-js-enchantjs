scalaJSSettings

name := "enchantjs"

normalizedName := "scalajs-enchantjs"

version := "0.1-SNAPSHOT"

organization := "com.github.suzuki0keiichi.scalajs"

crossScalaVersions := Seq("2.10.2", "2.11.0-M7", "2.11.0-M8", "2.11.0")

licenses += ("MIT", url("http://opensource.org/licenses/mit-license.php"))

libraryDependencies ++= Seq(
  "org.scala-lang.modules.scalajs" %% "scalajs-dom" % "0.3"
)

