package ch03_highLevelFunction

object Test13_DynamicBind {
  def main(args: Array[String]): Unit = {
    val student: Person13 = new Student13
    println(student.name)
    student.hello()
  }

}
class Person13 {
  val name: String = "person"
  def hello() : Unit = {
    println("hello person")
  }
}

class Student13 extends Person13 {
  override val name: String = "student"
  override def hello() : Unit = {
    println("hello student")
  }
}