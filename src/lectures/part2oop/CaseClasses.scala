package lectures.part2oop

object CaseClasses extends App {
  case class Person(name: String, age: Int)

  // 1. class parameters are promoted to fields

  val jim = new Person("Jim", 34)
  println(jim.age)

  // 2. sensible toString
  println(jim.toString)

  // 3. Equals and hashCode implemented out of the box
  val jim2 = new Person("Jim", 34)
  println(jim == jim2)

  // 4. Case classes have handy copy methods
  val jim3 = jim.copy(age = 45)
  println(jim)

  // 5. Case classes have companion objects
  val thePerson = Person
  val mary = Person("Mary", 23)

  // 6. Case classes are serializable
  // Akka

  // 7. Case classes have extractor patterns = Case Classes can be used in Pattern Matching

  case object UnitedKingdom {
    def name: String = "The United Kingdom of GB and NI"
  }


}
