package ch02

import scala.io.StdIn


object Test05_stdin {
  def main(args: Array[String]): Unit = {
    //输入
    println("请输入姓名：")
    val name = StdIn.readLine()
    println("请输入年龄")
    val age = StdIn.readInt()

    //输出
    println(s"欢迎${age}岁的${name}来作客")
  }

}
