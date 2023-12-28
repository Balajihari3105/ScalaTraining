import org.scalatest.funsuite.AnyFunSuite

class MathOperSpec extends  AnyFunSuite {


  test("test case for addition") {
    assert(MathOper.add(2, 3) == 5)
    assert(MathOper.add(100, 23) == 123)
    assert(MathOper.add(3, 0) == 3)
  }

  test("test case for division") {
    assert(MathOper.div(10, 2) == 5)
  }

  test("test case for division with zeros") {
    intercept[ArithmeticException] {
      MathOper.div(0, 0)
    }
  }


}
