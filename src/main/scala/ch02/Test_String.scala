package ch02

object Test_String {
  def main(args: Array[String]): Unit = {
    val name = "alice"
    val age = 18
    println(age + "岁的" + name + "在学习")
    printf("%d岁的%s在学习",age,name)
    println()
    println(s"${age}岁的${name}在学习")

    val num:Double = 2.3456
    println(f"The num is ${num}%.2f")

    val sql = s"""
       |select *
       |from student
       |where name = ${name}
       |and age = ${age}
       |""".stripMargin
    println(sql)

  }

}
