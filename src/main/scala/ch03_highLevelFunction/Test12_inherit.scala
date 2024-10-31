package ch03_highLevelFunction

object Test12_inherit {
  def main(args: Array[String]): Unit = {
    val student1 = new Student12("alice",18,"kk")
    println("===============================")
    val student2 = new Student12("bob",20,"atguigu","stu001")
  }

}
//定义一个父类
class Person12 {
  var name: String = _
  var age: Int = _
  println(s"1.父类主构造器调用")

  def this(name: String, age: Int){
    this()
    println(s"2.父类辅助构造器调用")
    this.name = name
    this.age = age
  }

  def printInfo(): Unit = {
    println(s"Person: $name $age")
  }
}

//定义一个子类
class Student12(name: String, age: Int, school: String) extends Person12{
  var stuNo: String = _
  println(s"3.子类主构造器调用")

  def this(name: String, age: Int, school: String, stuNo: String){
    this(name,age,school)
    println(s"4.子类辅助构造器调用")
    this.stuNo = stuNo
  }

  override def printInfo(): Unit = {
    println(s"Student: $name $age $stuNo")
  }
}