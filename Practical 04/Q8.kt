fun main(args: Array<String>) {
    val names = arrayOf("John", "Jane", "Mary")
    val ages = arrayOf(20, 21, 22)
  
    val nameAgePairs = mutableListOf<Pair<String, Int>>()
    for (i in 0 until names.size) {
      nameAgePairs.add(Pair(names[i], ages[i]))
    }
  
    for (nameAgePair in nameAgePairs) {
      println(nameAgePair)
    }
  }