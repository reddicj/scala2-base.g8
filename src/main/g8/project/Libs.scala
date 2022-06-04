import sbt._

object Libs {

  val ZIO = "2.0.0-RC6"

  val libraryDependencies = Seq(
    "org.typelevel" %% "cats-core" % "2.7.0",
    "dev.zio" %% "zio" % ZIO,
    "dev.zio" %% "zio-test" % ZIO % Test,
    "dev.zio" %% "zio-test-sbt" % ZIO % Test,
    "dev.zio" %% "zio-interop-cats" % "2.4.1.0",
    "dev.zio" %% "zio-prelude" % "1.0.0-RC14",
    "com.softwaremill.quicklens" %% "quicklens" % "1.8.8"
  )
}