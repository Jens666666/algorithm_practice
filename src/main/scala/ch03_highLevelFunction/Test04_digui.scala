package ch03_highLevelFunction

object Test04_digui {
  def main(args: Array[String]): Unit = {
    def fn(n: Int) : Int = {
      if(n == 0) return 1                   ///////////////
      fn(n - 1) * n
    }

    println(fn(5))
  }

}
