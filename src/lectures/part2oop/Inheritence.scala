package lectures.part2oop

object Inheritence extends App {

  class Animal {
    val creatureType = "wild"
    def eat = println("Eating")
  }

  class Cat extends Animal {
    final def crunch = {
      eat
      println("Cat Eating")
    }
  }

  val cat = new Cat
  cat.crunch



  class Person(name: String, age: Int)
  class Adult(name: String, age:Int, idCard: String) extends Person(name, age)

  // overriding
//  class Dog(override val creatureType: String) extends Animal {
////    override val creatureType: String = "domestic"
//    override def eat: Unit = println("Brunch Brunch")
//  }
  class Dog(dogType: String) extends Animal {
    override val creatureType: String =  dogType

    override def eat: Unit =
      super.eat
      println("Dog Eating!")
  }

  val dog = new Dog("Dog")
  dog.eat


  // type substitution
  val unknownAnimal: Animal = new Dog("K9")
  println("____Polymorphism____")

  unknownAnimal.eat


  // overriding - supplying different implementations in derived classes
  // overloading - supplying multiple methods with different signature but the same name within the same class


  // super is used when you want to reference a method or field from the derived class

  // To prevent overriding
  //  1. Use final on method
  //  2. use final on class
  //  3. seal the class protect from extending in other files
}



