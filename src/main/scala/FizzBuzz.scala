object FizzBuzz {
  private def isDivisibleBy(dividend: Int, divisor: Int): Boolean = {
    dividend % divisor == 0
  }

  private def curriedIsDivisibleBy(divisor: Int): Int => Boolean = {
    (dividend: Int) => dividend % divisor == 0
  }

  private val isDivisibleBy5 =
    // isDivisibleBy(_, 5)
    curriedIsDivisibleBy(5)

  private val isDivisibleBy3 = isDivisibleBy(_, 3)

  private def nToFizzBuzzValue(number: Int): String = (isDivisibleBy5(number), isDivisibleBy3(number)) match {
    case (true, true) => "FizzBuzz"
    case (true, _) => "Buzz"
    case (_, true) => "Fizz"
    case _      => number.toString
  }

  private def recursiveFn(number: Int): String = {
    if (number < 1) ""
    else {
      val previous = recursiveFn(number - 1)
      val current = nToFizzBuzzValue(number)
      if (previous == "") current else previous + ", " + current
    }
  }

  def generate(number: Int): String = {
    /*(1  to number) // .toList not required as range provides map function directly
      .map(nToFizzBuzzValue)
      .mkString(", ")*/
    recursiveFn(number)
  }
}