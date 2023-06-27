fun isPrime(n: Int): Boolean {
    if (n <= 1) {
        return false
    }
    for (i in 2 until n) {
        if (n % i == 0) {
            return false
        }
    }
    return true
}

fun main(args: Array<String>) {
    print("Enter a number: ")
    val num = readLine()!!.toInt()
    val isPrime = isPrime(num)
    if (isPrime) {
        println("$num is a prime number.")
    } else {
        println("$num is not a prime number.")
    }
}
