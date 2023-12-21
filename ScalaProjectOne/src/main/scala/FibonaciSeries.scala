import FibonaciSeries.fibonacciTailRecursive

object FibonaciSeries extends App {
  //fibanoci function

  def fibonaciSeries(num: Int) = {
    var num1 = 0
    var num2 = 1
    var sum = 0

    println(s"Fibonacci series upto $num :")
    for (i <- 0 until num) {
      print(num1 + " ")
      sum = num1 + num2
      num1 = num2
      num2 = sum
    }
  }
  //  fibonaciSeries(10)


  //fibonacii series in recursion
  def fibonacciRecursive(i: Int): Int = {
    if (i <= 1) {
      i
    } else {
      fibonacciRecursive(i - 1) + fibonacciRecursive(i - 2)
    }
  }
  //  val num=10
  //  for (i <- 0 to num) {
  //    println( fibonacciRecursive(i))
  //  }

  //fibnpcii tail recursion

//  def fibonacciTailRecursive(n: Int): Unit = {
//    def fun( n: Int, a: Int=0 , b: Int=1): Int = {
//      println(a)
//      if (n == 0) a
//      else {
//         fibonacciTailRecursive( n - 1,a=b,b=a+b)
//      }
//    }
//  }
//fibonacciTailRecursive(5)


}
//0 1 1 2 3 5 8