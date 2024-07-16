object FizzBuzz {
  def nToFizzBuzzValue(number: Int): String = number match {
    case x if x % 15 == 0 => "FizzBuzz"
    case x if x % 5 == 0 => "Buzz"
    case x if x % 3 == 0 => "Fizz"
    case x => x.toString
  }

  def generate(number: Int): String = {
    (1  to number)
      .map(nToFizzBuzzValue)
      .mkString(", ")
  }
}