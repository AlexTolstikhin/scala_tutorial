package lectures.part2oop

object Traits extends App {
  // abstract members
  abstract class Animal {
    val creatureType: String
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Canine"

    override def eat: Unit = println("Crunch")
  }

  // traits
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  class Crocodile extends Animal with Carnivore {
    override val creatureType: String = "croc"
    override def eat: Unit = "Numnumnum"
    override def eat(animal: Animal): Unit = println(s"I'm $creatureType and I'm eating ${animal.creatureType}")

  }

  val dog = new Dog
  val croc = new Crocodile
  println(croc.eat(dog))

  // traits vs abstract classes
  // 1. both can have abstract and non-abstract members
  // 2. Traits do not have constructor parameters
  // 3. Multiple Traits can be inherited by the same class
  // 4. Traits are behavior
}
