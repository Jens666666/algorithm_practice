package ch02

import org.omg.PortableInterceptor.ServerRequestInfo

object Test07_functionAndMethod {
  def main(args: Array[String]): Unit = {
    //定义函数
    def sayHi(name: String): Unit ={
      println("hi, " + name)
    }

    //调用函数
    sayHi("alice")

    //调用对象方法
    val result = Test07_functionAndMethod.sayHello("bob")
    println(result)
  }

  //定义对象方法
  def sayHello(name: String): String ={
    println("hello, " + name)
     "Hello, " + name
  }

}
