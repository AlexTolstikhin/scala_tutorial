package lectures.part2oop

object Inheritence extends App {
  class Animal {
    val creatureType = "wild"
    // def can public, protected or private

    final def eat: Unit  = println("nananana")
  }


  // single class inheritance
  class Cat extends Animal {

  }
  val cat = new Cat



//  constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
}
  class Adult(name: String, age: Int, idCard: String) extends Person("Alex", 30)

  //overriding

  class Dog(override val creatureType: String) extends Animal {
    override def eat: Unit = {
      super.eat
      println("Crunch crunch")
    }
  }

  val dog = new Dog("Domestic")
  dog.eat
  println(dog.creatureType)


  // type substitution (polymorphism)
  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat

  // Overriding vs Overloading

  // super
  // super allows to access methods and fields of the super class

  // Preventing overriding
  // 1. Use final in front of methods or class fields
  // 2. Use final on the class (You can't extend class)
  // 3. Seal the class (You can extend class in this file but can't outside) ==> sealed class Animal
}
