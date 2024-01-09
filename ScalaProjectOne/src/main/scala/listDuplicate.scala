import scala.collection.mutable
import scala.collection.mutable.Map

object listDuplicate extends App {

  def removeDuplicates[A](list: List[A], uniqueSet: Set[A], result: List[A]): List[A] = {
    list match {
      case Nil => result
      case head :: tail if uniqueSet.contains(head) => removeDuplicates(tail, uniqueSet, result)
      case head :: tail => removeDuplicates(tail, uniqueSet + head, result :+ head)


    }

  }

  //  val list = List(1, 1, 1, 2, 2, 1, 1, 2, 3, 4, 4, 3, 2, 1)

  val inputList = List(1, 2, 3, 4, 4, 5, 2, 1, 2, 3, 6)
  val uniqueList = removeDuplicates(inputList, Set(), List())
  println(uniqueList)

  // pair remove duplicate
  //  val list = List(1, 1, 1, 2, 2, 1, 1, 2, 3, 4, 4, 3, 2, 1)
  //  //  Output: List(1,2,1,2,3,4,3,2,1)


  def removeConsecutiveDuplicates(lst: List[Int]): List[Int] = lst match {
    case Nil => Nil
    case head :: tail => head :: removeConsecutiveDuplicates(tail.dropWhile(_ == head))
  }

  val list = List(1, 1, 1, 2, 2, 1, 1, 2, 3, 4, 4, 3, 2, 1)
  val result = removeConsecutiveDuplicates(list)

  println(result)


def findSumIndices(list: List[Int],sum:Int): Option[(Int,Int)]={
  for (i <- list.indices){
    val y=list.indexOf(sum-list(i))
    if(y != -1 && y!=i){
      return Some(i,y)
    }

  }
  None
  }

  val list1=List(2,3,412,4,6)
  val sum=10
  val indices=findSumIndices(list1, sum)
  indices match{
    case Some((ind1,ind2)) => println(s"The sum of the index pair is: $ind1 and $ind2")
    case None => println(s"None of the pair index is found in the list for the sum $sum")
  }
}






