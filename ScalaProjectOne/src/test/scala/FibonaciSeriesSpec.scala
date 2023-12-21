import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

import java.util.Collections.list

class FibonacciSeriesSpec extends AnyFunSuite {

  test("Fibonacci series for 0 should be empty") {

    assert( FibonaciSeries.fibonacciRecursive(0) ===0)
    assert( FibonaciSeries.fibonacciRecursive(1) ===1)
    assert( FibonaciSeries.fibonacciRecursive(2) ===1)
    assert( FibonaciSeries.fibonacciRecursive(3) ===2)
  }
  test("Fibonacci series for 5 should be empty") {
    assert( FibonaciSeries.fibonacciRecursive(4) ===3)
    assert(FibonaciSeries.fibonacciRecursive(5) === 5)
    assert( FibonaciSeries.fibonacciRecursive(10) ===55)
  }

  //test case for tail recursion
  test("Fibonacci series using tail recursive should be empty") {
    val result = FibonaciSeries.fibTailRec(10)
    val expectedList = List(0, 1, 1, 2, 3, 5, 8, 13, 21, 34)

    assert(result===expectedList)
  }
}
