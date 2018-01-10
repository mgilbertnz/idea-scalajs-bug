import org.scalajs.sbtplugin.ScalaJSPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt.Keys._
import sbt.file

lazy val testProject = crossProject.in(file("src"))
  .settings(
    scalaVersion := "2.12.4",
  )
  .jsConfigure(
    _.enablePlugins(ScalaJSPlugin)
  )

lazy val testProjectJvm = testProject.jvm

lazy val testProjectJs = testProject.js
