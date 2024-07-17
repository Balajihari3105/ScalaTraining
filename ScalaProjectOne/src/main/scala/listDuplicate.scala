import scala.annotation.tailrec
import scala.collection.mutable
import scala.collection.mutable.Map

object listDuplicate extends App {
  println("helloguy")

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

  /*
  Sum of the index pairs
   */


  def findSumIndices(list: List[Int], sum: Int): Option[(Int, Int)] = {
    for (i <- list.indices) {
      val y = list.indexOf(sum - list(i))
      if (y != -1 && y != i) {
        return Some(i, y)
      }

    }
    None
  }

  val list1 = List(2, 3, 412, 4, 6)
  val sum = 10
  val indices = findSumIndices(list1, sum)
  indices match {
    case Some((ind1, ind2)) => println(s"The sum of the index pair is: $ind1 and $ind2")
    case None => println(s"None of the pair index is found in the list for the sum $sum")
  }


  //  def indexOfelement(list1:List[Int],element: Int,count:Int):Int={
  //  list1 match{
  //    case Nil => count
  //    case  ::
  //  }
  //  }

  //count the same elemrnts in a list

  def countSimilar(list: List[Int], m: Map[Int, Int]): Map[Int, Int] = {
    list match {
      case Nil => m
      case x :: tail if (m.contains(x)) => m(x) = m(x) + 1
        countSimilar(tail, m)
      case x :: tail => m += x -> 1
        countSimilar(tail, m)
    }


  }

  val list4 = List(1, 1, 2, 3, 4, 5, 6, 6)
  println(countSimilar(list4, Map.empty[Int, Int]))

  def fibonacciSeries(num: Int): List[Int] = {
    @tailrec
    def fibonacciHelper(num1: Int, first: Int, second: Int, listOfFibonacci: List[Int]): List[Int] = {
      num1-1 match {
        case 0 => List(0) ++ listOfFibonacci
        case 1 => List(0, 1) ++ listOfFibonacci
        case _ => fibonacciHelper(num1 - 1, second, first + second, listOfFibonacci :+ (first + second))
      }
    }

    fibonacciHelper(num, 0, 1, List.empty)
  }

println(s"The list of fibanocii series ${fibonacciSeries(8)}")
//  println(s"List of Fibonacci ${fibonacciSeries(8)}")
// 8 def fibo(n: Int): List[Int] = {
//
//    def fibHelper(n: Int, a: Int = 0, b: Int = 1): List[Int] = n match {
//      case 0 => List()
//      case 1 => List(a)
//      case _ => a :: fibHelper(n - 1, b, a + b)
//    }
//    fibHelper(n)
//  }
//  println(fibo(8))
//
//  println(fibo(8))
}





