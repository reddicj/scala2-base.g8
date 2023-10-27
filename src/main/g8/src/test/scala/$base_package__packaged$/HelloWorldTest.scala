package $base_package$

import zio.test.Assertion._
import zio.test._

object HelloWorldTest extends ZIOSpecDefault {
  def spec: Spec[Any, Nothing] = suite("HelloWorld tests")(

    test("Test 1") {
      assert(HelloWorld.msg)(equalTo("Hello World"))
    }
  )
}