package ch03_highLevelFunction

object Test15_bansheng {
  def main(args: Array[String]): Unit = {
   /* val student: Student15 = new Student15("alice",18)
    student.printInfo()*/
    val student1 = Student15.newStudent15("bob",20)
    student1.printInfo()
    val student2 = Student15("cary",25)
    student2.printInfo()
  }
}
//伴生类
class Student15 private(var name:String, var age: Int) {
  def printInfo(): Unit = {
    println(s"student: $name $age ${Student15.school}")
  }
}

//伴生对象
object Student15 {
  val school: String = "atguigu"

  def newStudent15(name:String, age: Int) : Student15 = new Student15(name,age)
  def apply(name:String, age: Int) : Student15 = new Student15(name,age)
}
