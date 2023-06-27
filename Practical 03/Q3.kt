fun main(args: Array<String>) {
    val age = 25
    val ageGroup = if (age < 18) {
        "minor"
    } else if (age <= 64) {
        "adult"
    } else {
        "senior citizen"
    }
    println("You are a $ageGroup.")
}
