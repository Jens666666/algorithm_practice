package ch03_highLevelFunction

import scala.math.Ordering.Boolean

object Test09_myWhile {
  def main(args: Array[String]): Unit = {
    var n = 10
    def myWhile1(condition: =>Boolean) : (=>Unit)=>Unit = {
      def doLoop(op: =>Unit) : Unit = {
        if(condition){
          op
          myWhile1(condition)(op)  //柯里化
        }
      }
      doLoop _
    }
    myWhile1(n >= 1){
      println(n)
      n -= 1
    }
    println("=================")
    //简化
    def myWhile2(condition: =>Boolean) : (=>Unit)=>Unit = {
      op => {
        if(condition){
          op
          myWhile2(condition)(op)
        }
      }
    }
     n = 10
    myWhile2(n >= 1){
      println(n)
      n -= 1
    }
    println("=================")

    //柯里化
    def myWhile3(condition: =>Boolean)(op: =>Unit) : Unit = {
        if(condition){
          op
          myWhile3(condition)(op)
        }
      }

     n = 10
    myWhile3(n >= 1){
      println(n)
      n -= 1
    }
    println("=================")

  }

}
