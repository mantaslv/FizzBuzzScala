import org.scalatest.funsuite.AnyFunSuite
class FizzBuzzTest extends AnyFunSuite {
  test("lists the numbers up to one") {
    assert(FizzBuzz.generate(1) == "1")
  }

  test("lists the numbers up to two") {
    assert(FizzBuzz.generate(2) == "1, 2")
  }

  test("lists the numbers up to three") {
    assert(FizzBuzz.generate(3) == "1, 2, Fizz")
  }

  test("lists the numbers up to four") {
    assert(FizzBuzz.generate(4) == "1, 2, Fizz, 4")
  }

  test("lists the numbers up to five") {
    assert(FizzBuzz.generate(5) == "1, 2, Fizz, 4, Buzz")
  }

  test("lists the numbers up to fifteen") {
    assert(FizzBuzz.generate(15) == "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz")
  }
}