package ch1

class Student(name: String, var age: Int) {
  def printInfo(): Unit = {
    println(name + " " + age + " " + Student.school)
  }
}

object Student{
  val school: String = "atguigu"

  def main(args: Array[String]): Unit = {
    val alice = new Student("cxk", 20)
    val bob = new Student("csd", 18)
    alice.printInfo()
    bob.printInfo()
  }
}