package ch2

import ch1.Student

object Teat01_Variable {
  def main(args: Array[String]): Unit = {
    var alice = new Student("alice", 24)
    alice = new Student("alice_2", 24)
    val Bob = new Student("Bob", 18)
    //Bob = new Student("Bob_2", 18)
    Bob.age = 25
    Bob.printInfo()
  }
}
