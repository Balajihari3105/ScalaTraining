import org.scalatest.funsuite.AnyFunSuite

class ScalaListSpec extends AnyFunSuite{


  test("case_1 empty list" ){
    val list=List()
    assert(ScalaList.reverseList(list)==Nil)
  }
  test("case_1 single list" ){
    val list=List(1)
    assert(ScalaList.reverseList(list)==List(1))
  }

  test("case_3 pasing more elements list" ){
    val list=List(1,2,3,4,56,6,7)
    assert(ScalaList.reverseList(list)==List(7,6,56,4,3,2,1))
  }
  test("case_4 pasing same elements list" ){
    val list=List(1,1,1,1,1,1)
    assert(ScalaList.reverseList(list)==List(1,1,1,1,1,1))
  }

  test("case_5 pasing same elements list" ){
    val list=List(1,1,1,1,1,1)
    assert(ScalaList.reverseList(list)==List(1,1,1,1,1,1))
  }

  test("handles mixed-case strings") {
    val mixedCaseList: List[Any] = List("Hello", "World")
    assert(ScalaList.reverseList(mixedCaseList) === List("World", "Hello"))
  }

}
