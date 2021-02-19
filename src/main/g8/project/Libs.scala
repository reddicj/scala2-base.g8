import sbt._

object Libs {

  val libraryDependencies = Seq(
    "org.apache.commons" % "commons-lang3" % "3.11",
    "org.apache.commons" % "commons-text" % "1.9",
    "commons-io" % "commons-io" % "2.8.0",
    "org.typelevel" %% "cats-core" % "2.4.2",
    "dev.zio" %% "zio" % "1.0.4-2",
    "dev.zio" %% "zio-test" % "1.0.4-2",
    "dev.zio" %% "zio-test-sbt" % "1.0.4-2",
    "dev.zio" %% "zio-interop-cats" % "2.0.0.0-RC11",
    "com.softwaremill.quicklens" %% "quicklens" % "1.6.1",
    "com.github.pathikrit" %% "better-files" % "3.9.1"
  )
}