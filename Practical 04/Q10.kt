fun main(args: Array<String>) {
    val tasks = arrayOf("Buy groceries", "Clean the house", "Do the laundry")
  
    val taskCompletionStatus = arrayOf(false, false, false)
  
    for (i in 0 until tasks.size) {
      println("Task: ${tasks[i]} - Completed: ${taskCompletionStatus[i]}")
    }
  }
  