package ch02

object Test07_parameter {
  def main(args: Array[String]): Unit = {
    //可变参数
    def f1(str : String*) : Unit = {
      println(str)
    }
    f1("aaa","bbb")

    def f2(str1 : String, str2 : String*) : Unit = {
      println("str1: " + str1 + " " + "str2: " + str2)
    }
    f2("alice","bbb","ccc")

    def f3(name : String = "atguigu") : Unit = {
      println("My school is " + name)
    }

    f3("清华")
    f3()

    def f4(name: String = "atguigu", age : Int) : Unit = {
      println(s"${age}岁的${name}")
    }

    f4(age = 26)

  }

}
