package scalabasic

import org.scalatest.funsuite.AnyFunSuite

class FibonacciSeriesSpec extends AnyFunSuite {

  test("Fibonacci series for with ussual function") {

    assert( FibonaciSeries.fibonacciRecursive(0) ===0)
    assert( FibonaciSeries.fibonacciRecursive(1) ===1)
    assert( FibonaciSeries.fibonacciRecursive(2) ===1)
    assert( FibonaciSeries.fibonacciRecursive(3) ===2)
  }
  test("Fibonacci series using recursive") {
    assert( FibonaciSeries.fibonacciRecursive(4) ===3)
    assert(FibonaciSeries.fibonacciRecursive(5) === 5)
    assert( FibonaciSeries.fibonacciRecursive(10) ===55)
  }

  //test case for tail recursion
  test("Fibonacci series using tail recursive") {
    val result = FibonaciSeries.fibTailRec(10)
    val expectedList = List(0, 1, 1, 2, 3, 5, 8, 13, 21, 34)

    assert(result===expectedList)
  }
}
