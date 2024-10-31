package ch02

import scala.io.Source

object Test06_fileIO {
  def main(args: Array[String]): Unit = {
    //读取文件数据
    Source.fromFile("src/main/resources/test.txt").foreach(print)
  }

}
