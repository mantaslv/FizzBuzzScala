object FizzBuzz {
  private def nToFizzBuzzValue(number: Int): String = (number % 5, number % 3) match {
    case (0, 0) => "FizzBuzz"
    case (0, _) => "Buzz"
    case (_, 0) => "Fizz"
    case _      => number.toString
  }

  def generate(number: Int): String = {
    (1  to number) // .toList not required
      .map(nToFizzBuzzValue)
      .mkString(", ")
  }
}