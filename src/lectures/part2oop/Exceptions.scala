package lectures.part2oop

import java.nio.BufferUnderflowException

object Exceptions extends App {
  val x: String = null

//  println(x.length)
  // this ^^ will crash with NPE
  // 1. Throwing exceptions

//  val aWeirdValue: String = throw new NullPointerException

  // throwable classes extend the Throwable class
  // Exception and Error are the major Throwable subtypes

  // 2. how to catch exceptions
  def getInt(withExceptions: Boolean): Int =
    if (withExceptions) throw new RuntimeException("No int for you!")
    else 42

//  val potentialValue = try {
//    // code that might fail
//    getInt(true)
//  } catch {
//    case e: RuntimeException => 43
//  } finally {
//    // code that will get executed no matter what
//    // optional
//    // does not influence the return type of this expression
//    // use finally for side effect (Adding logs to a file)
//    println("Finally")
//  }


//  println(potentialValue)

  // 3. how to define your own exceptions
//  class MyException extends Exception
//  val exception = new MyException
//
//  throw exception


//  throw new OutOfMemoryError
//  throw new StackOverflowError("Hello")

  class OverflowException extends RuntimeException
  class UnderflowException extends RuntimeException
  class MathCalculationException extends RuntimeException("DivisonByZero")

  object PocketCalculator {
    def add(a: Int, b: Int): Int = {
      val result = a + b
      if (a > 0 && b > 0 && result < 0) throw new OverflowException
      else if (a < 0 && b < 0 && result > 0 ) throw new UnderflowException
      else result
    }

    def subtract(a: Int, b: Int): Int = {
      val result = a - b
      if (a > 0 && b < 0 && result < 0) throw new OverflowException
      else if (a < 0 && b > 0 && result > 0 ) throw new UnderflowException
      else result
    }

    def multiply(x: Int, y: Int): Int = {
      val result = x * y
      if (x > 0 && y > 0 && result < 0) throw new OverflowException
      if (x < 0 && y < 0 && result < 0) throw new OverflowException
      if (x > 0 && y < 0 && result > 0) throw new UnderflowException
      if (x < 0 && y > 0 && result > 0) throw new OverflowException
      result
    }

    def divide(x: Int, y: Int):Int = {
      if (y == 0) throw new MathCalculationException
      else x / y
    }
  }

  println(PocketCalculator.divide(1, 0))

}
