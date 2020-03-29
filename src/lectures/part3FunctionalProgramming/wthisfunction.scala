package lectures.part3FunctionalProgramming

object wthisfunction extends App {
//  val doubler = new MyFunction[Int, Int] {
//    override def apply(element: Int): Int = element * 20
//  }
//
//  println(doubler(10))

  // function types = Function1[A,B]
  val stringToIntConverter = new ((String) => Int) {
    override def apply(element: String): Int = element.toInt
  }

  println(stringToIntConverter("3") + 4)

  val adder = new ((Int, Int) => Int) {
    override def apply(a: Int, b: Int): Int = a + b
  }

  // Function types Function2[A,B,R] === (A,B) => R

  // ALL SCALA FUNCTIONS ARE OBJECTS

  val concatStrings = new ((String, String) => String) {
    override def apply(a: String, b:String): String = a + b
  }

  println(concatStrings("Hello", " Sunday!"))

//  val callBack = new ((Int) => )
  val superAdder: (Int) => ((Int) => Int) = (x: Int) => (y: Int) => x + y
}

//trait MyFunction[A,B] {
//  def apply(element: A): B
//}


