object test1 {
  def main(args: Array[String]): Unit = {
    println("aaa")
    //变量
    var a: Int = 10
    var a1 = 20
    a1 = 40
    //常量
    val b:Int = 23
    val b1 = 30
    println(b1)

    def add(a:Int, b:Int):Unit ={
      val c = a + b
      println(c)
    }

    def add2(a:Int, b:Int ):Int = {
      val c= a+b
      c
    }
    val e = add(20,20)
    println(e)


    val d = add2(10,1)
    add(d,1)
    add(d,2)
    add(d,3)


    println(d)

  }
}
