fun main(args: Array<String>) {
    val friends = mutableListOf<String>()
  
    println("Enter the names of your three friends:")
    val friend1 = readLine()!!
    val friend2 = readLine()!!
    val friend3 = readLine()!!
  
    friends.add(friend1)
    friends.add(friend2)
    friends.add(friend3)
  
    println("The names of your friends are:")
    for (friend in friends) {
      println(friend)
    }
  }