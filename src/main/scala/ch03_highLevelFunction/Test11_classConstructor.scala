package ch03_highLevelFunction

object Test11_classConstructor {
  def main(args: Array[String]): Unit = {
    var student2 = new Student2
    student2.name = "alice"
    student2.age = 18
    println(s"student2: name = ${student2.name}, age = ${student2.age}")

    var student3 = new Student3("bob",20)
    println(s"student3: name = ${student3.name}, age = ${student3.age}")

    var student4 = new Student4("cary",25)
    student4.school = "atguigu"
    student4.printInfo()
  }

}

class Student2 {
  var name: String = _
  var age: Int = _
}


class Student3(var name: String, var age: Int)

class Student4(name: String, age: Int){
  var school: String = _

/*  def this(name: String, age: Int, school: String){
    this(name,age)  //调用主构造器
    this.school = school
  }*/

  def printInfo(): Unit ={
    println(s"student4: name = ${name}, age = ${age}, school = ${school}")
  }

}