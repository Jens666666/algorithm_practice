package ch03_highLevelFunction

object Test01_ArrayFunction {
  def main(args: Array[String]): Unit = {
    val arr = Array(1, 2, 3, 4)

    def arrayFunction(array : Array[Int], op : Int=>Int) : Array[Int] = {
      for (elem <- array) yield op(elem)
    }

    def addOne(elem : Int) : Int = {
      elem + 1
    }

    val arr1 = arrayFunction(arr,addOne)
    println(arr1.mkString(", "))

    val arr2 = arrayFunction(arr,_ * 2 -2)
    println(arr2.mkString(", "))

  }

}
