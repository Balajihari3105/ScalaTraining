object KthElement extends App {
  def kthEle(list: List[Int], check: Int): Boolean = {
    list match {
      case head :: _ if (head == check) => true
      case _ :: tail => kthEle(tail, check)
      case _ => false

    }
  }

  //  def kthElementFun(head: Int, list: List[Int], check: Int): Boolean = {
  //    if (head == check) true
  //    else
  //      kthElementFun()
  //  }

  val list = List()
  println(s"The elment in the list${kthEle(list, 89)}")

  def addListOfElement(list: List[Int]): Int = {
    def helper(list: List[Int], sum: Int): Int = {
      list match {
        case Nil => sum
        case head :: tail => helper(tail, head + sum)
      }
    }

    helper(list, 0)
  }

  val list1 = List(1, 2, 3, 4)
  println(s"sum of the element in the list is ${addListOfElement(list1)}")

}
