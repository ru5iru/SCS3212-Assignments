fun main(args: Array<String>) {
    val students = mutableListOf<Any>()
  
    println("Enter the details for three students:")
    for (i in 1..3) {
      val name = readLine()!!
      val age = readLine()!!.toInt()
      val grade = readLine()!![0]
  
      val student = Student(name, age, grade)
      students.add(student)
    }
  
    println("The details of the students are:")
    for (student in students) {
      println(student)
    }
  }
  
  data class Student(val name: String, val age: Int, val grade: Char)