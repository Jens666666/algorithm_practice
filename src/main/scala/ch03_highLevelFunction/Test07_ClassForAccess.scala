package ch03_highLevelFunction

object Test07_ClassForAccess {

}

class Person{
  private var idCard: String ="389246"
  protected var name: String = "alice"
  var age: Int = 18
  private[ch03_highLevelFunction] var sex: String = "female"

  def printInfo() = {
    println(s"Person: ${idCard} ${name} ${age} ${sex}")
  }
}
