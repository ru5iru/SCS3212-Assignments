fun main(args: Array<String>) {
    val items = arrayOf(
      Item("Apples", 2, 1.5),
      Item("Oranges", 3, 2.0),
      Item("Milk", 1, 3.0),
      Item("Bread", 1, 2.5),
    )
  
    var totalCost = 0.0
    for (item in items) {
      println("${item.name}: ${item.quantity} @ ${item.price} = ${item.quantity * item.price}")
      totalCost += item.quantity * item.price
    }
  
    println("Total cost: $totalCost")
  }
  
  data class Item(val name: String, val quantity: Int, val price: Double)