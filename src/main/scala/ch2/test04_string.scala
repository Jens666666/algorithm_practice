package ch2

object test04_string {
  def main(args: Array[String]): Unit = {
    val name = "alicr"
    val age = 14

    println(name*3 + " " + age)

    printf("%d岁的%s在尚硅谷学习", age, name)

    println(s"${age}岁的${name}在尚硅谷学习")
  }

}
