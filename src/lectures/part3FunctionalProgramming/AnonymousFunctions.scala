package lectures.part3FunctionalProgramming

object AnonymousFunctions extends App {
//  val doubler = new Function[Int, Int] {
//    override def apply(x:Int) = x * 2
//  }
  // anonymous function (LAMBDA
  val doubler: Int => Int = (x: Int) => x * 2

  // multiple params in a lambda
  val adder: (Int, Int) => Int = (a: Int, b: Int) => a + b

  // no params
  val justDoSomething: () => Int = () => 3

  println(justDoSomething)
  println(justDoSomething())

  // curly braces with lambdas
  val stringToInt = { (str: String) =>
    str.toInt
  }


  val niceIncremeneter: Int => Int = _ + 1
  val niceAdder: (Int, Int) => Int = _ + _
}
