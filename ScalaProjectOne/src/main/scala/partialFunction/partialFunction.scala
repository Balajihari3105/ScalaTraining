package partialFunction

import scala.language.implicitConversions


object partialFunction extends App{

//def add (a:Int)(implicit c: Int): Int={
//    a+c
//  }


//  implicit val c: Int =10
//println(add(10))


//  implicit def diff(f:String):Int = f.toInt
//
//
//  val e="23"
//  println(diff(e))
////  20.diff

//  e.diff
//  implicit class Calculation(a : Int){
//    def total:Double={
//      a+ 10
//    }
//println(20.total)
//  }
  val dress={
    println("dress")
    32
  }

  lazy val name={
    println("name")
    "Balaji"
  }
  println(name)

}
