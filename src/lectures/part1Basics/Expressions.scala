package lectures.part1Basics

object Expressions extends App {

  val x = 1 + 2 // EXPRESSION
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift with 0 extension)

  print(1 == x)
  // == != > < <= >=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2

  aVariable += 3
  // += -= *= /=  (...side effects)

  // Instructions (tell the computer TO DO) vs Expressions(something that has a Value or Type)

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // IF EXPRESSION
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)

  var i = 0
  // AVOID LOOPS
  while (i < 10) {
    println(i)
    i += 1
  }

  // Everything in scala is an expression

  val aWeirdValue = (aVariable = 3) // Unit === void

  print(aWeirdValue)

  // side effects: println(), whiles, reassigning

  // code blocks, block scoping works the same way as javascript blocks
  val aCodeBloc = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }
//  Difference between "hello world" and println("hello world")
//  1st is variable of type string and 2nd is an expression(side effect) which type is Unit
val someValue = {
    2 > 3
}
//  Boolean false
println(someValue)
  val someOtherValue = {
    if (someValue) 239 else 987
    42
  }
  // 42 Int
print(someOtherValue)
}
