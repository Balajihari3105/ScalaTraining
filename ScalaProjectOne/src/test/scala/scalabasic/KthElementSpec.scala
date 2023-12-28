import org.scalatest.funsuite.AnyFunSuite

class KthElementSpec extends AnyFunSuite{
//write the test case for above method
  //for -ve and +ve scenario
  //when you found the element => true
  //when you didn't found the element=> false

test("kthEle returns true when the first element matches the check value"){
  val list = List(4, 2, 6, 1)
  val check = 4
  assert(KthElement.kthEle(list,check))
}
  test("kthEle returns true when the kth element matches the check value") {
    val list = List(1, 3, 5, 7)
    val check = 5
    assert(KthElement.kthEle(list, check))
  }
  test("kthEle returns false when the kth element not matches the check value") {
    val list = List(1, 3, 5, 7)
    val check = 6
    assert(!KthElement.kthEle(list, check))
  }
  test("kthEle returns false for empty list") {
    val list = List()
    val check = 6
    assert(KthElement.kthEle(list, check) === false)
  }
  test("kthEle handles single element in the list") {
    val list = List(1)
    val check = 1
    assert(KthElement.kthEle(list, check) === true)
  }
  test("kthEle handles lists with repeated elements") {
    val list = List(2, 2, 4, 2)
    val check = 2
    assert(KthElement.kthEle(list, check) === true)
  }
}
