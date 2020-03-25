package lectures.part2oop

object CaseClasses extends App {
  case class Person(name: String, age: Int)
  // 1. Class parameters are promoted to fields
  val jim = new Person("Jim", 32)
  println(jim.name)
  // 2. sensible to toString
  // println(instance) = println(instance.toString) // syntatic sugar
  println(jim)

  // 3. Equals and hashCode implemented OOTB
  val jim2 = new Person("Jim", 34)
  println(jim == jim2)


  // 4. CCs have handy copy methods
  val jim3 = jim.copy(age = 55)
  println(jim3)

  // 5. CCs have companion objects
  val thePerson = Person
  val mary = Person("Mary", 12)
  println(mary)

  // 6. Case classes are serializable
  // Akka


  // 7. CCs have extractor patterns = CCs can be used in PATTERN MATCHING

  case object UnitedKingdom {
    def name: String = "The UK of GB and NI"
  }


}
