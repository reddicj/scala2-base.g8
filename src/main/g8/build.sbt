import BuildHelper.*

name := "$name;format="lower,hyphen"$"
organization := "$base_package$"

ThisBuild / scalaVersion := "$scala_version$"
ThisBuild / scalacOptions := Settings.compilerOptions
ThisBuild / semanticdbEnabled := true
ThisBuild / semanticdbVersion := scalafixSemanticdb.revision
ThisBuild / scalafixDependencies ++= List(
  "com.github.liancheng" %% "organize-imports" % "0.6.0",
  "com.github.vovapolu"  %% "scaluzzi"         % "0.1.23"
)
ThisBuild / scalafixScalaBinaryVersion := "2.13"
ThisBuild / testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")

addCompilerPlugin("org.typelevel"  %% "kind-projector"     % "0.13.2" cross CrossVersion.full)
addCompilerPlugin("com.olegpy"     %% "better-monadic-for" % "0.3.1")
addCompilerPlugin("org.augustjune" %% "context-applied"    % "0.1.4")

addCommandAlias("fmt", "; scalafmtSbt; scalafmtAll")
addCommandAlias("fix", "; scalafixAll; scalafmtSbt; scalafmtAll")
addCommandAlias("check", "; scalafmtSbtCheck; scalafmtCheckAll; scalafixAll --check")

lazy val root = (project in file("."))
  .configs(IntegrationTest)
  .settings(
    welcomeMessage,
    buildInfoSettings("$name;format="lower,hyphen"$"),
    Defaults.itSettings,
    Libs.dependencies,
    inConfig(IntegrationTest)(scalafixConfigSettings(IntegrationTest))
  )
  .enablePlugins(BuildInfoPlugin)
