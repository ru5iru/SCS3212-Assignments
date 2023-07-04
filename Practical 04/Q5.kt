fun main(args: Array<String>) {
    val array1 = arrayOf(5, 2, 9)
    val array2 = arrayOf(3, 7, 1)
  
    val combinedArray = array1 + array2
  
    combinedArray.sortDescending()
  
    for (element in combinedArray) {
      println(element)
    }
  }