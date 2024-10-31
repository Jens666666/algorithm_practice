package ch03_highLevelFunction

object Test08_constructor {
  def main(args: Array[String]): Unit = {
    var student1:Student1 = new Student1()
    println("===================")
    student1 = new Student1("bob")
    println("===================")
    student1 = new Student1("bob2",99)
  }

}

class Student1() {
  var name: String = _
  var age: Int = _
  println("1.主构造方法被调用")

  def this(name: String) {
    this() //调用主构造方法
    println("2.辅助构造方法一被调用")
    this.name = name
    println(s"name: ${name} age: ${age}")
  }

  def this(name: String, age: Int) {
      this(name) //调用辅助方法一
      println("3.辅助构造方法二被调用")
      this.age = age
      println(s"name: ${name} age: ${age}")
    }

  def stu() = {
      println("一般方法被调用")
    }

}
