//package inheritance
//class A extends B with C{
//  override def cCall(): Unit = {
//    println("c in a")
//  }
//
//
//}
//abstract class B{
//  def bCall(): Unit = {
//    println("B")
//  }
//}
//trait C{
//  def cCall(): Unit = {
//    println("C")
//  }
//}
//class Book(var name : String, var isbn : Int) {
////  def this(name: String) =
////    this(name, 123)
//def this(i:Int) = {
//  this(i,1234)
//}
//  def this() =
//    this("", null)
//}
//object inHeritance extends App {
//  val a=new A()
//  print(a.bCall())
//
//  print(a.cCall())
//  val book:Book= new Book ("272883")
//  println(book.name)
//  println(book.isbn)
//
//
//}