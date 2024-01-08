package scalabasic


object ScalaList extends App{
  def reverseList(list: List[Any]): List[Any] = {
    def helper(list: List[Any], accumulator: List[Any] = Nil): List[Any] = list match {
      case Nil => accumulator
      case head :: tail => helper(tail, head :: accumulator)
    }

    helper(list)
  }


  val l = List(1, 2, 3, 4, 5, 6)

  println(reverseList(l))
}