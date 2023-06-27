fun factorial(n: Int): Int {
  if (n == 0) {
      return 1
  } else {
      return n * factorial(n - 1)
  }
}

fun main(args: Array<String>) {
  print("Enter a number: ")
  val num = readLine()!!.toInt()
  val factorial = factorial(num)
  println("The factorial of $num is: $factorial")
}
