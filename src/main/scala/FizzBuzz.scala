object FizzBuzz {
  def generate(number: Int): String = {
    (1 to number).toList.map {
      case x if x % 5 == 0 => "Buzz"
      case x if x % 3 == 0 => "Fizz"
      case x => x.toString
    }.mkString(", ")
  }
}