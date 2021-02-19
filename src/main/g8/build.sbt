name := "$name;format="lower,hyphen"$"
organization := "$base_package$"

scalaVersion := "$scala_version$"
scalacOptions := Settings.compilerOptions

addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.11.3" cross CrossVersion.full)
libraryDependencies ++= Libs.libraryDependencies
testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")