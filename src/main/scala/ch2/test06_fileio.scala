package ch2

import scala.io.Source

object test06_fileio {
  def main(args: Array[String]): Unit = {
    //1.从文件中读取数据
    Source.fromFile("src/main/resources/test.txt").foreach(print)

  }

}
