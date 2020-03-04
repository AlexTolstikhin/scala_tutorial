package lectures.part2oop

object MethodNotations extends App {
  class Person(val name: String, favoriteMovie: String) {
    def likes(movie: String): Boolean = movie == favoriteMovie

    def hangoutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def unary_! : String = s"$name, what a hack!?"

    def isAlive: Boolean = true

    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
  }

  val mary = new Person("Mary", "Inception")
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
  println(mary isAlive)

  // apply method is defined in class with apply() and can be called with className() the same as className.apply()
  println(mary.apply())
  println(mary())
}
