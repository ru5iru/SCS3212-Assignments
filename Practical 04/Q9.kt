fun main(args: Array<String>) {
    val fruits = arrayOf("Apple", "Orange", "Banana")
    val vegetables = arrayOf("Potato", "Carrot", "Cucumber")
  
    val allNames = fruits + vegetables
  
    for (name in allNames) {
      println(name)
    }
  }
  