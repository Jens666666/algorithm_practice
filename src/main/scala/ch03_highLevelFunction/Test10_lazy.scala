package ch03_highLevelFunction

object Test10_lazy {
  def main(args: Array[String]): Unit = {
    lazy val result:Int = sum(1,2)

    println("1. 函数调用")
    println("2. result: " + result)
    println("3. result: " + result)


  }
  def sum(a: Int, b: Int) : Int = {
    println("4. sum调用")
    a + b
  }
}
