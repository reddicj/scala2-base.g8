name := "scala-g8"

enablePlugins(ScriptedPlugin)

addCommandAlias("test", "g8Test")

scriptedLaunchOpts ++= Seq(
  "-Xms1g",
  "-Xmx1g",
  "-XX:ReservedCodeCacheSize=128m",
  "-Xss2m",
  "-Dfile.encoding=UTF-8"
)
