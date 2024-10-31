package ch03_highLevelFunction

object Test05_chuanMing {
  def main(args: Array[String]): Unit = {
    //传值
    def f0(f1: Int=> Int) : Unit = {

      println("a: " + f1(3))
      println("a: " + f1(3))

    }

    def f1(b: Int) : Int = {
      println("f1被调用")
      12
    }
    f0(f1)

    println("===================")

    //传名
    def f2(a: =>Int) : Unit = {
      println("a: " + a)
      println("a: " + a)
    }

    f2(f1(3))
    //传值
    println(s"a: ${12}")
    println(s"a: ${12}")

    //chuanming
    println(s"a:${f1(3)}")
    println(s"a:${f1(3)}")
  }

}
