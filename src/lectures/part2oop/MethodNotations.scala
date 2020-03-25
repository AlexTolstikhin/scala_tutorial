package lectures.part2oop
import scala.language.postfixOps

object MethodNotations extends App {
  class Person(val name: String, val favoriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favoriteMovie

    def hangoutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def unary_! : String = s"$name, what a hack!?"

    def + : Person = new Person("Mary (the rockstar)", this.favoriteMovie, 39)

    def unary_+ : Person = new Person(this.name, this.favoriteMovie, this.age + 1)

    def isAlive: Boolean = true

    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"

    def apply(n: Int): String = s"$name watched $favoriteMovie $n times"

    def learns(str: String) = s"Mary learns $str"

    def learnsScala() : String = {
      return this.learns("Scala")
    }

  }

  def learnsScala (): Unit = {
    val person = new Person("Hello", "Test", 33)
    return person.learns("Scala")
  }

  val mary = new Person("Mary", "Inception", 30)
  println(mary.likes("Inception"))
  println(mary likes "Inception") // infix notation (syntactic sugar) = operator notation ==> works only with methods that have a single parameter


  // "operators" in Scala
  val tom = new Person("Tom", "Fight Club")
  println(mary hangoutWith tom)

  println(1 + 2)
  println(1.+(2))
  // All OPERATORS ARE METHODS
  // Akka actors have ! ?

  // prefix notation
  val x = -1 // equivalent of 1.unary_-
  val y = 1.unary_-
  // unary_prefix only works with few operators - + ~ !
  println(!mary)
  println(mary.unary_!)

  // postfix notation
  println(mary.isAlive)
  println(mary.isAlive)

  // apply method is defined in class with apply() and can be called with className() the same as className.apply()
  println(mary.apply())
  println(mary())

  val neMar = mary+;
  println(neMar.name)


  +mary;
  +mary;
  +mary;
  println(+mary)
  println(mary learnsScala)

  println(mary())
}

