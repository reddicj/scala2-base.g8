import sbt.*
import Keys.*

object Libs {

  val ZIO = "2.0.18"

  val dependencies = libraryDependencies ++= Seq(
    "org.typelevel"              %% "cats-core"    % "2.10.0",
    "dev.zio"                    %% "zio"          % ZIO,
    "dev.zio"                    %% "zio-test"     % ZIO % "test,it",
    "dev.zio"                    %% "zio-test-sbt" % ZIO % "test,it",
    "dev.zio"                    %% "zio-prelude"  % "1.0.0-RC21",
    "com.softwaremill.quicklens" %% "quicklens"    % "1.9.6"
  )
}
