package lectures.part2oop

object AbstractDataTypes extends App {
  // abstract ==> not defined(implemented)
  abstract class Animal {
    val creatureType: String = "wild"
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "domestic"
    // override is not required here
    def eat: Unit = println("Crunch crunch")
  }


  // traits
  trait Carnivore {
    def eat(animal: Animal): Unit
    val preferredMeal: String = "fresh meat"
  }

  trait ColdBlooded

  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "wild"
    override def eat: Unit = println("NomNomNOm")
    override def eat(animal: Animal): Unit = println(s"I'm a ${this.creatureType} and I'm eating ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)
  croc.eat

  // traits vs abstract classes
  // 1. Traits do not have constructor parameter trait
  // 2. Multiple traits may be inherited by the same class
  // 3. traits are behavior, abstract class is a type of thing
}
