package ch02

object Test07_lambda {
  def main(args: Array[String]): Unit = {
    def f1(a: Int, b: Int) : Int = {
      return a + b
    }

    val c = f1(3,5)
    println(c)
    println("=======================")

    def dualFunctionOneAndTwo(fun: (Int,Int) => Int) :Int = {
      fun(1, 2)
    }

    println(dualFunctionOneAndTwo((a,b) => {
      a + b
    }))
    println(dualFunctionOneAndTwo((a,b) => a - b))


    val c1 = f1 _
    println(c1)
    println(c1(4,5))

    def fx(op: (Int, Int) => Int, a : Int, b : Int) : Int = {
     op(a,b)
    }

    def add(a:Int,b:Int) : Int = {
      a + b
    }

    println(fx(add,12,35))
    println(fx((a,b) => a + b, 12, 35))
  }


}
