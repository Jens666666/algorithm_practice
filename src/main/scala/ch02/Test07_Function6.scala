package ch02

object Test07_Function6 {
  def main(args: Array[String]): Unit = {
    //1. 无参，无返回值
    def f1(): Unit ={
      println("1. 无参，无返回值")
    }
    f1()
    println(f1())
    println("===========================")

    //2. 无参，有返回值
    def f2(): String ={
      println("2. 无参，有返回值")
      return "Hello"
    }
    println(f2())
    println("===========================")

    //3. 有参，无返回值
    def f3(name : String): Unit ={
      println("3. 有参，无返回值" + name)
    }
    println(f3("alice"))
    println("===========================")

    //4. 有参，有返回值
    def f4(name : String): String ={
      println("4. 有参，有返回值")
      return "hi, " + name
    }

    println(f4("bob"))
    println("===========================")

    //5. 多参，无返回值
    def f5(name1 : String, name2 : String) : Unit = {
      println("5. 多参，无返回值")
    }
    println(f5("cary","david"))
    println("===========================")

    //6. 多参，有返回值
    def f6(a : Int, b : Int) : Int = {
      println("6. 多参，有返回值")
      return a + b
    }
    println(f6(2,5))
  }

}
