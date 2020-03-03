package lectures.part1Basics

import scala.annotation.tailrec

object Recursion extends App {
  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)
      result
    }

  //  println(factorial(9))

  // Tail recursion example
  def anotherfactorial(n: Int): BigInt = {
    @tailrec
    def factorialhelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factorialhelper(x - 1, x * accumulator)
    }

    factorialhelper(n, 1)
  }

  //  println(anotherfactorial(1000))

  @tailrec
  def concatString(s: String, n: Int, accumulator: String = ""): String = {
    if (n <= 0) accumulator
    else concatString(s,n-1,accumulator+s)
  }

  println(concatString("hello",2))

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailRec(t: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailRec(t - 1, n % t != 0 && isStillPrime)
    }
    isPrimeTailRec(n / 2, true)
  }

  println(isPrime(11))

  def fibonacci(n: Int): Int = {
    def fiboTailRec(i: Int, last: Int, nextToLast: Int): Int =
      if (i >= n) last
      else fiboTailRec(i + 1, last + nextToLast, last)
    if (n <= 2) 1
    else fiboTailRec(2, 1, 1)
  }

  println(fibonacci(8))
}





