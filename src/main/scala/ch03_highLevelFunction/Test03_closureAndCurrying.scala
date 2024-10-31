package ch03_highLevelFunction

object Test03_closureAndCurrying {
  def main(args: Array[String]): Unit = {
    def addByFour(a : Int) : Int=>Int = {
      def addB(b: Int) : Int = {
        a + b
      }
      addB
    }

    //简写 : f(x ) = a + b
    def addByA(a : Int) : Int=>Int =  a + _

    val addByFour1 = addByA(4) // f(x) = 4 + b
    println(addByFour1(10))   // addByA(4)(10)   f(x) = 4 + 10

    //柯里化
    def addCurry(a: Int)(b: Int) : Int = {
      a + b
    }

    val addB = addCurry(12)(_)
    println(addB(23))

    println(addCurry(12)(34))


  }

}
