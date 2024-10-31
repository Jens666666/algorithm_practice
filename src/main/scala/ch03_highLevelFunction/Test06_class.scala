package ch03_highLevelFunction

import scala.beans.BeanProperty

object Test06_class {
  def main(args: Array[String]): Unit = {
    var student = new Student()

    println(student.getAge())
    println(student.setAge(18))
    println(student.getAge)
    //student.age = 24
    //println(student.age)

    println(student.sex)
    student.sex = "女"
    println(student.sex)
  }
}

class Student{
  private var name: String = "aaa"
  @BeanProperty
  protected var age: Int = _
  var sex: String = _



}