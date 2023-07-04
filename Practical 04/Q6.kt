fun main(args: Array<String>) {
    val numbers = arrayOf(10, 4, 2, 9, 7, 5, 1, 3, 6, 8)
  
    var max = numbers[0]
    var min = numbers[0]

    for (number in numbers) {
      if (number > max) {
        max = number
      } else if (number < min) {
        min = number
      }
    }
  
    println("The maximum value is $max")
    println("The minimum value is $min")
  }