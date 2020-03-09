package kata.factorial

import org.scalatest.should.Matchers
import org.scalatest.freespec.AnyFreeSpec

class FactorialSpec extends AnyFreeSpec with Matchers {

  "Factorial of 0 should be 0" in {
    Factorial(0) shouldBe 0
  }

}
