//package playground
//
//abstract class MyList extends MyPredicate[MyList] {
//  def head: Int
//  def tail: MyList
//  def isEmpty: Boolean
//  def add(element: Int): MyList
//  def printElements: String
//  // polymorphic call
//  override def toString: String = "[" + printElements + "]"
//
//  def map[B] (transformer: MyTransformer[A, B]): MyList[B]
//  def flatMap[B] (trasformer: MyTransformer[A, MyList[n]])
//}
//
//object Empty extends MyList {
//  def head: Int = throw new NoSuchElementException
//  def tail: MyList = throw new NoSuchElementException
//  def isEmpty: Boolean = true
//  def add(element: Int): MyList = new Cons(element, Empty)
//  def printElements: String = " "
//}
//
//class Cons(h: Int, t: MyList) extends MyList {
//  def head: Int = h
//  def tail: MyList = t
//  def isEmpty: Boolean = false
//  def add(element: Int): MyList = new Cons(element, this)
//  def printElements: String =
//    if(t.isEmpty) " " + h
//    else h + " " + t.printElements
//}
//
//trait MyPredicate[-T] {
//  def test(elem: T): Boolean
//}
//
//trait MyTransformer[-A, B] {
//  def transform(elem: A): B
//}
//
//object ListTest extends App {
//  val list = new Cons(1, Empty);
//  val add10List = list.add(10)
//  println(add10List.tail)
//  println(add10List.toString)
//}
//
