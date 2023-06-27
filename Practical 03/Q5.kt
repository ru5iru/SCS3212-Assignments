fun main(args: Array<String>) {
    print("Enter a number: ")
    val number = readLine()!!.toInt()
    var sum = 0
    var i = 2
    while (i <= number) {
        if (i % 2 == 0) {
            sum += i
        }
        i++
    }
    println("The sum of even numbers between 1 and $number is: $sum")
}