package ch03_highLevelFunction

object Test14_AbstractClass {
  def main(args: Array[String]): Unit = {
    val student: Person14 = new Student14
    println(student.name)
    println(student.age)
    student.eat()
    student.sleep()
  }
}

//定义抽象类
abstract class Person14 {
  //非抽象属性
  val name: String = "person"
  //抽象类属性
  var age: Int
  //非抽象方法
  def eat(): Unit = {
    println("person eat")
  }
  //抽象方法
  def sleep(): Unit
}

//定义一个实现类
class Student14 extends Person14 {
  //实现抽象属性和方法
  var age: Int = 18
  def sleep(): Unit = {
    println("student sleep")
  }
  //重写非抽象属性和方法
  override val name: String = "student"
  override def eat(): Unit = {
    super.eat()  //调用父类方法
    println("student eat")
  }
}