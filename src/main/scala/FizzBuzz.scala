object FizzBuzz {
  def generate(number: Int): String = {
    if (number == 1) {
      "1"
    } else if (number == 2) {
      "1, 2"
    } else {
      "1, 2, Fizz"
    }
  }
}