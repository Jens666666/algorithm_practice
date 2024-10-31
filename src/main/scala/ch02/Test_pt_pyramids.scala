package ch02

object Test_pt_pyramids {
  def main(args: Array[String]): Unit = {
    //金字塔
    for(i <- 1 to 9){
      val stars = 2 * i - 1;
      val spaces = 9 - i;
      println(" " * spaces + "*" * stars)

    }
  }

}
