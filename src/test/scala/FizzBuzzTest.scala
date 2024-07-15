import org.scalatest.funsuite.AnyFunSuite
class FizzBuzzTest extends AnyFunSuite {
  test("lists the numbers up to one") {
    assert(FizzBuzz.generate(1) === "1")
  }

  test("lists the numbers up to two") {
    assert(FizzBuzz.generate(2) === "1, 2")
  }

  test("lists the numbers up to three") {
    assert(FizzBuzz.generate(3) === "1, 2, Fizz")
  }
}