package lectures.part1Basics

object Functions extends App {

//  Define a function

  def aFunction(a: String, b: Int): String =
    a + " " + b

  val result: String = aFunction("Hello", 2)
  println(result)

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())
  println(aParameterlessFunction)


  def aRepeatedFunction(aString: String, anInt: Int): String = {
    if (anInt == 1) aString
    else aString + aRepeatedFunction(aString, anInt - 1)
  }

  println(aRepeatedFunction("hello", 3))
  // USE RECURSION INSTEAD OF LOOPS


  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b
    aSmallerFunction(n, n-1)
  }

  println(aBigFunction(10))


//
  //  1. A greeting function (name, age) => Hi my name is $name and I am $age years old
  //  2. Factorial function math function that computes 1 * 3 * 4 .. * n
  //  3. A Fibonacci function
  //    f(1) = 1
  //    f(2) = 1
  //    f(n) = f(n - 1) + f(n - 2)
  //  4. Test if a number is prime

  //1.
  def greetingFunction(name: String, age: Int): String = {
    "Hi my name is " + name + " and I am "+ age + "years old"
  }
  println(greetingFunction("Alex", 30))

  def factorialFunction(number: Int):Int = {
    if (number <= 0 ) 1
    else number * factorialFunction(number - 1)
  }

  println(factorialFunction(4))

  def fibonacciSequence(number: Int): Int = {
    if (number == 1 || number == 2) 1
    else fibonacciSequence(number - 1) + fibonacciSequence(number - 2)
  }

  println(fibonacciSequence(10))

  def isPrimeNumber(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(n / 2)
  }

  println(isPrimeNumber(3))
}


