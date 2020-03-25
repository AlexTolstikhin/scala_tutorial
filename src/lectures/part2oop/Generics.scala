//package lectures.part2oop
//
//object Generics extends App{
//  class MyList[+A] {
//    // use the type A
//    def add[B >: A](element: B): MyList[B] = ???
//
//
//    /*
//      A = Cat
//      B = Dog = Animal
//
//     */
//  }
//
//  class MyMap[Key, Value]
//
//  val listOfIntegers = new MyList[Int]
//  val listOfStrings = new MyList[String]
//
//
//  // generic methods
//  object MyList {
//    def empty[A]: MyList[A] = ???
//  }
//
//  val emptyListOfIntegers = MyList.empty[Int]
//
//  // variance problem
//  class Animal
//  class Cat extends Animal
//  class Dog extends Animal
//
//  // 1. yes List[Cat] extends List[Animal] = Covariance
//
//  class CovariantList[+A]
//  val animal: Animal = new Cat
//  val animalList: CovariantList[Animal] = new CovariantList[Cat]
//
//
//  // 2. No == Invariance
//  class InvariantList[A]
//  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]
//
//
//  // 3. Hell, no == Controvariance
//  class ContravariantList[-A]
//  val contravariantList: ContravariantList[Cat] = new ContravariantList[Animal]
//  class Trainer[-A]
//  val trainer: Trainer[Cat] = new Trainer[Animal];
//
//
//  // 4. Bounded Types
//  class Cage[A <: Animal] (animal: A)
//  val cage = new Cage(new Dog)
//
//  class Car
//  val newCage = new Cage(new Car) // Error:(50, 17) inferred type arguments [lectures.part2oop.Generics.Car] do not conform to class Cage's type parameter bounds [A <: lectures.part2oop.Generics.Animal]
//
//
//
//
//}
