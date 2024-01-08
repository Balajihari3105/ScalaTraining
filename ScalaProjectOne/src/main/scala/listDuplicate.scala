object listDuplicate extends App {

  def removeDuplicates(list: List[Int], uniqueSet: Set[Int], result: List[Int]): List[Int] = {
    list match {
      case Nil => result
      case head :: tail if uniqueSet.contains(head) => removeDuplicates(tail, uniqueSet, result)
      case head :: tail => removeDuplicates(tail, uniqueSet + head,  result :+ head)


    }

  }

  //  val list = List(1, 1, 1, 2, 2, 1, 1, 2, 3, 4, 4, 3, 2, 1)

  val inputList = List(1, 2, 3, 4, 4, 5, 2, 1, 2, 3, 6)
  val uniqueList = removeDuplicates(inputList, Set(), List())
  println(uniqueList)

  // pair remove duplicate
  //  val list = List(1, 1, 1, 2, 2, 1, 1, 2, 3, 4, 4, 3, 2, 1)
  //  //  Output: List(1,2,1,2,3,4,3,2,1)




}






//def removeDuplicates(list: List[Int]): List[Int] = list match {
//  case Nil => Nil
//  case
//    head :: tail => head :: removeDuplicates(tail.filter(_ != head))
//}