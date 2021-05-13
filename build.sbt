name := "HelloScalaJs"

version := "0.1"

scalaVersion := "2.13.5"

enablePlugins(ScalaJSPlugin)

scalaJSUseMainModuleInitializer := true

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "1.1.0"

jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()