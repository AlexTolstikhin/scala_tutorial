package lectures.part2oop

object AnonymousClassess extends App {
  abstract class Animal {
    def eat: Unit
  }

  // Anonymous class ==> we have instanciated AnonymousClasses$$annno$1 class
  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("HAHAHAHA")
  }

  class Person(name: String) {
    def sayHi: Unit = println(s"HI my name is ${this.name}")
  }

  val jim = new Person("Jim"){
    override def sayHi: Unit = println(s"Hi my name is Jim")
  }




}
