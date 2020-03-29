package lectures.part2oop

import playground.{PrinceCharming => PrinceHello, ScalaPlayground}

import java.util.Date
import java.sql.{Date => SqlDate}
// I can use _ to import all memebers from playgroung
object PackagingAndImports extends App {
  // package members are accessible by the simple name
//  val writer = new Writer("Daniel", "RockTheJVM")
  val scala = ScalaPlayground

  // package object
  sayHello
  println(SPEED_OF_LIGHT)

  // imports

  val prince = new PrinceHello

  // use fully qualified name
  // or use aliasing
  val date = new Date
  val sqlDate = new SqlDate(2018, 5, 5)

//  default imports
// java.lang - String, Object, Exception
// scala - Int, Nothing, Function
// scala.Predef - println, ???

}

