package lectures.part2oop

object Objects {
  // SCALA DOESN'T HAVE CLASS LEVEL FUNCTIONALITY ("STATIC")
  def main(args: Array[String]) : Unit = {


    object Person { // type + its only instance
      // "static"/"class" - level functionality
      val N_EYES = 2
      def canFly: Boolean = false


      // factory method
      def apply(mother: Person, father: Person) : Person = new Person("Bobby")
    }

    class Person (val name : String){
        // instance level functionality
    }
    // Companions
  //
  //  println(Person.N_EYES)
  //  println(Person.canFly)


    // Scala object = is a singleton instance
    val mary = new Person("Alex")
    val john = new Person("Eldana")
    println(mary == john)

    val person1 = Person
    val person2 = Person
    println(person1 == person2)

    val bobie = Person(mary, john)
    println(bobie.name)

    // Scala Application = Scala object with
    // def main(args: Array[String]: Unit
    // or you can use extends App which has its own main method
  }

}
