package $base_package$

import zio.test.Assertion._
import zio.test._

object HelloWorldIntegrationTest extends ZIOSpecDefault {
  def spec = suite("HelloWorld integration tests")(

    test("Integration Test 1") {
      assert(HelloWorld.msg)(equalTo("Hello World"))
    }
  )
}