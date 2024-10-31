package ch02

object Test06_Forloop {
  def main(args: Array[String]): Unit = {
    //for循环
    for (i <- 1.to(10)){
      println(i + ". hello dengziliang")
    }

    //九九乘法表
    for(i <- 1 to 9){
      for(j <- 1 to i)
        print(s"$j * $i = ${i * j} \t")
      println()
    }
    println("============")
    //简写
    for(i <- 1 to 9; j <- 1 to i){
      print(s"$j + $i = ${i * j} \t")
      if(j == i)
        println()
    }

  }
//int.add(3)


}
