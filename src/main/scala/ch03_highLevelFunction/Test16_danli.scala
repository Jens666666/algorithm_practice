package ch03_highLevelFunction

object Test16_danli {
  def main(args: Array[String]): Unit = {
    val student1 = Student16.getInstance()
    student1.printInfo()
    println(student1)
  }
}
//单例设计模式Student16：调用的时候用getinstance
class Student16 private(var name:String, var age: Int) {
  def printInfo(): Unit = {
    println(s"student: $name $age ${Student15.school}")
  }
}

//饿汉式
/*
object Student16 {
  private val student: Student16 = new Student16("alice",18)
  def getInstance(): Student16 = student
}*/

//懒汉式
object Student16 {
  private var student: Student16 = _
  def getInstance(): Student16 = {
    if(student == null){
      student = new Student16("bob",20)
    }
    student
  }
}