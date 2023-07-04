fun main(args: Array<String>) {
    val numbers = mutableListOf<Int>()
  
    println("Enter five numbers:")
    for (i in 1..5) {
      val number = readLine()!!.toInt()
      numbers.add(number)
    }
  
    val sum = numbers.sum()
    println("The sum of the numbers is $sum")
  }