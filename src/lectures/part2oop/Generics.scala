package lectures.part2oop

object Generics extends App {
  class MyList[+A] {
    // use the type A
    def add[B >: A](element: B): MyList[B] = ???
    /*
    A = Cat
    B = Dog (Animal)

     */
  }
  class MyMap[Key, Value]


  val listOfIntegers = new MyList[Int]
  val listOfString = new MyList[String]

  // generic methods

  object MyList {
    def empty[A]: MyList[A] = ???
  }

  val emptyListOfIntegers = MyList.empty[Int]
  // variance problem

  class Animal

  class Cat extends Animal
  class Dog extends Animal


  // 1. yes list of List[Cat] extends List[Animal] == Covariance

  class CovariantList[+A]

  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
  // animalList.add(new Dog) ??? HARD QUESTION ==> we return a list of animals

  // 2. No list of cats and list of animals are too different things
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]


  // 3. Hell no! Contravariant classes
  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]


  // Bounded Types
  class Cage[A <: Animal](animal: A) // class Cage only accepts type parameter A which are subtypes of Animal class
  val cage = new Cage(new Dog)

  class Car
  val newCage = new Cage(new Cat)

  // expand MyList ot be generic

}
