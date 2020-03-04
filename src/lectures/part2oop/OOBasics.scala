package lectures.part2oop

import java.io.Writer

object OOBasics extends App {
  val person = new Person("Jeff", 30)
  println(person.greet("Alex"))
  person.greetNext()

  var author = new Writer("Charles", "Dickens", 1812)
  var imposter = new Writer("Charles", "Dickens", 1812)

  var novel = new Novel("Great Expectations", 1861, author)

  println(novel.authorAge())
  println(novel.isWrittenBy(imposter))
  println(novel.isWrittenBy(author))

  val counter = new Counter
  counter.inc.inc.inc.inc.print
  counter.inc(10).print
}

class Person (name: String, val age: Int) { //constructor
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")
  def greetNext(): Unit = println(s"$name")


  // multiple constructors
  def this(name: String) = this(name, 0)
  def this() = this("John doe")
}

class Writer(first_name: String, surname: String, val year: Int) {
  def fullName: String = this.first_name + "  " + this.surname
}

class Novel(name: String, release: Int, author: Writer) {
  def authorAge() = release - author.year

  def isWrittenBy(author: Writer) = author == this.author

  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}

class Counter(val count: Int = 0) {
  def inc = {
    println("Increment")
    new Counter(count + 1)
  } // Immutability
  def dec = {
    println("Decrement")
    new Counter(count - 1)
  }

  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n - 1)
  }
  def dec(n: Int): Counter = {
    if (n <= 0) this
    else dec.dec(n - 1)
  }

  def print = println(count)

}
