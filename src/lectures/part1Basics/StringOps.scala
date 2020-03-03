package lectures.part1Basics

object StringOps extends App {
  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2))
  println(str.contains("l"))
  println(str.substring(7,11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.length)


  // Scala utilities
  val aNumberString = "45"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString) // Prepending operation +:
  println(aNumberString :+ "n") // Appending operation :+
  println(aNumberString.reverse)
  println(str.take(2))

  // S-interpolator
  val name = "Alex"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age years old"
  println(greeting)

  val greeting2 = s"Hello, my name is $name and I will be turning ${age + 1} years old"
  println(greeting2)

  // F-interpolator
  val speed = 1.2f
  val myth = f"$name%s can eat $speed%2.2f burgers per minute"
  println(myth)

  // raw-interpolator
  println(raw"This is a \n newline")
  val escaped = "This is a \n newline"
  println(raw"$escaped")

}
