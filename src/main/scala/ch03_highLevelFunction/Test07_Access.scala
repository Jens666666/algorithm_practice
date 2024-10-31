package ch03_highLevelFunction

object Test07_Access {
  def main(args: Array[String]): Unit = {
    val person: Person = new Person()
    person.age = 20
    person.sex = "male"
    person.printInfo()

    var worker:Worker = new Worker()
    println(worker.age)
    worker.printInfo()

  }

}

class Worker extends Person{
  override def printInfo: Unit = {
    name = "bob"

    sex = "male"

    println(s"Worker: ${name} ${age} ${sex}")
  }
}