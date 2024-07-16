object FizzBuzz {
  private def isDivisibleBy(dividend: Int, divisor: Int): Boolean = {
    dividend % divisor == 0
  }

  private val isDivisibleBy5 = isDivisibleBy(_, 5)
  private val isDivisibleBy3 = isDivisibleBy(_, 3)

  private def nToFizzBuzzValue(number: Int): String = (isDivisibleBy5(number), isDivisibleBy3(number)) match { // tuple pattern matching reduces conditionals
    case (true, true) => "FizzBuzz"
    case (true, _) => "Buzz"
    case (_, true) => "Fizz"
    case _      => number.toString
  }

  def generate(number: Int): String = {
    (1  to number) // .toList not required as range provides map function directly
      .map(nToFizzBuzzValue)
      .mkString(", ")
  }
}