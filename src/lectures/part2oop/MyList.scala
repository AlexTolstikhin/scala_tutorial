package lectures.part2oop

abstract class MyList {
  /*
    head = first element of the list
    tail = remainder of the list
    isEmpty = is this list empty
    add(int) => new list with this element added
    toString => a string representation of the list
   */
  def header: Int
  def tail: MyList
  def isEmpty: Boolean
  def add(int: Int): MyList
  def printElements: String
  // polymorphic call
  override def toString: String = "[" + printElements + "]"
}

object Empty extends MyList {
  def header: Int = throw new NoSuchElementException
  def tail: MyList = throw new NoSuchElementException
  def isEmpty: Boolean = true
  def add(int: Int): MyList = new Cons(int, Empty)
  def printElements: String = ""
}

class Cons(h: Int, t: MyList) extends MyList {
  def header: Int = h
  def tail: MyList = t
  def isEmpty: Boolean = false
  def add(int: Int): MyList = new Cons(int, this)
  def printElements: String =
    if(t.isEmpty) "" + h
    else h + " " + t.printElements
}

object ListTest extends App {
  val list = new Cons(1, new Cons(2, new Cons(3, Empty)))
  println(list.add(4).header)

  println(list.toString)
}