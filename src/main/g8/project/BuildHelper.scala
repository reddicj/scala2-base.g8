import sbt.Keys._
import sbt._

object BuildHelper {

  def welcomeMessage = onLoadMessage := {
    import scala.Console

    def item(text: String): String = s"\${Console.GREEN}> \${Console.CYAN}\$text\${Console.RESET}"
    def subItem(text: String): String = s"  \${Console.YELLOW}> \${Console.CYAN}\$text\${Console.RESET}"

    s"""|Useful sbt tasks:
        |\${item("fix")}     - Fixes sources files using scalafix
        |\${item("fmt")}     - Formats source files using scalafmt
        |\${item("check")}   - Checks the source code for conformance to the formatting and scalafix rules
    """.stripMargin
  }
}