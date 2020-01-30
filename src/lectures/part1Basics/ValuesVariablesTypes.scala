package lectures.part1Basics

object ValuesVariablesTypes extends App{
  val x: Int = 30
  // VAL-s are immutable like const in javascript
  // Compiler can infer types

  val aString: String = "alex"

  // Basic types
  val aBoolean: Boolean = true
  val bBoolean: Boolean = false
  val aChar: Char = 'a'
  val aShort: Short = 4613
  val aLong: Long = 1231231231323123123L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.15

  // variables
  var aVariable: Int = 4
  aVariable = 2 // side effects
  println(aString)
}
