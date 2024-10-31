package ch2

import scala.io.StdIn

object test05_stdin {
  def main(args: Array[String]): Unit = {
    //输入信息
    println("请输入名字")
    val name = StdIn.readLine()
    println("age")
    val age = StdIn.readInt()
    println(s"欢迎${name}, ${age}来学习")
  }

}
