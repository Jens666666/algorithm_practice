package ch03_highLevelFunction

object Test02_practice {
  def main(args: Array[String]): Unit = {
    //练习1
    val fun = (i : Int, s : String, c : Char) => {
      if(i == 0 && s == "" && c == '0') false else true
    }

    println(fun(0, "", '0'))
    println(fun(7, "", '0'))
    println(fun(0, "hi", '0'))
    println(fun(0, "", 97))

    val c:Char = 178
    println(c)

    //练习2
    def func(i: Int) : String => Char => Boolean  = {
      def f1(s : String) : Char => Boolean  = {
        def f2(c : Char) : Boolean = {
          if(i == 0 && s == "" && c == '0') false else true
        }
        f2
      }
      f1
    }

    println(func(0)("")('0'))
    println(func(1)("")('0'))
    println(func(0)("hi")('0'))
    println(func(0)("")('2'))

    //简写1
    def func1(i: Int) : String => Char => Boolean  = {
      s => c => if(i == 0 && s == "" && c == '0') false else true
    }

    //简写2


  }

}
