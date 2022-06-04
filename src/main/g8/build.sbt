name := "$name;format="lower,hyphen"$"
organization := "$base_package$"

ThisBuild / scalaVersion := "$scala_version$"
ThisBuild / scalacOptions := Settings.compilerOptions
ThisBuild / semanticdbEnabled := true
ThisBuild / semanticdbVersion := scalafixSemanticdb.revision
ThisBuild / scalafixDependencies += "com.github.liancheng" %% "organize-imports" % "0.5.0"
ThisBuild / scalafixScalaBinaryVersion := "2.13"

addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.13.2" cross CrossVersion.full)
addCompilerPlugin("com.olegpy" %% "better-monadic-for" % "0.3.1")
addCompilerPlugin("org.augustjune" %% "context-applied" % "0.1.4")

libraryDependencies ++= Libs.libraryDependencies
testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")