package check1

object OptionTryFuture extends App {
  def funcString(): String = {
    null
  }

  val fun = funcString()
  println(fun)

  //  def methodWhichCanThrowException(): String = throw new RuntimeException
  //  val aTry = Try(methodWhichCanThrowException())
  //  println(aTry)

  //  val aFuture = Future{
  //    println("Loading...")
  //
  //  Thread.sleep(1000)
  //    println("I have computed a value.")
  //    67
  //  }
  //  println(aFuture)

  //val pf:PartialFunction[Int,Int]= {
  //
  //}
  def duplicates(list: List[Int]): Unit = {
    val uniqueElem = Set[Int]()
    for (x <- list) {
      if (!uniqueElem.contains(x)) {
//        uniqueElem = uniqueElem +: x

      }

    }
  }

  val list = List(1, 1, 1, 2, 2, 1, 1, 2, 3, 4, 4, 3, 2, 1)

  duplicates(list)
//  Output: List(1,2,1,2,3,4,3,2,1)

}
