import sbt._

object Libs {

  val libraryDependencies = Seq(
    "org.apache.commons" % "commons-lang3" % "3.12.0",
    "org.apache.commons" % "commons-text" % "1.9",
    "commons-io" % "commons-io" % "2.11.0",
    "org.typelevel" %% "cats-core" % "2.6.1",
    "dev.zio" %% "zio" % "1.0.11",
    "dev.zio" %% "zio-test" % "1.0.11" % Test,
    "dev.zio" %% "zio-test-sbt" % "1.0.11" % Test,
    "dev.zio" %% "zio-interop-cats" % "2.4.1.0",
    "com.softwaremill.quicklens" %% "quicklens" % "1.7.4",
    "com.github.pathikrit" %% "better-files" % "3.9.1"
  )
}