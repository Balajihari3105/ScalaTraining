//package partialFunction
//
//import scala.language.implicitConversions
//
//
//object partialFunction extends App {
//
//  //def add (a:Int)(implicit c: Int): Int={
//  //    a+c
//  //  }
//
//
//  //  implicit val c: Int =10
//  //println(add(10))
//
//
//  //  implicit def diff(f:String):Int = f.toInt
//  //
//  //
//  //  val e="23"
//  //  println(diff(e))
//  ////  20.diff
//
//  //  e.diff
//  //  implicit class Calculation(a : Int){
//  //    def total:Double={
//  //      a+ 10
//  //    }
//  //println(20.total)
//  //  }
//  //  val dress={
//  //    println("dress")
//  //    32
//  //  }
//  //
//  //  lazy val name={
//  //    println("name")
//  //    "Balaji"
//  //  }
//  //  println(name)
//  val sumFm: Function1[Int, Function2[Int, Int, Int]] = new Function1[Int, Function2[Int, Int, Int]] {
//    override def apply(n1: Int) = new Function2[Int, Int, Int] {
//      override def apply(n2: Int, n3: Int) = {
//        n1 + n2 + n3
//      }
//
//    }
//
//
//  println("sum "+ sumFm(2)(5,3))
//
////
////  val sumPm:(Int=>(Int,Int)) =(Int,Int): Int = n1{
////    (Int,Int,Int) =
////  }
////  val sumPaf: Int => (Int, Int) => Int = n1 => (n2, n3) => n1 + n2 + n3
////}