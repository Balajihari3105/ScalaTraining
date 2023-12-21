import scala.collection.mutable.ListBuffer

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
    fibonaciSeries(10)


  //fibonacii series in recursion
  def fibonacciRecursive(i: Int): Int = {

    if (i <= 1) {
      i
    } else {
      fibonacciRecursive(i - 1) + fibonacciRecursive(i - 2)
    }
  }
println()
println(fibonacciRecursive(5))
//  println("recursion")
//  val num = 10

//  for (i <- 0 to num) {
//    print(s"${fibonacciRecursive(i)} ")
//  }


  //fibanocii sereies using tail recursion
  //
  def fibTailRec(num: Int): ListBuffer[Int] = {
    val a: ListBuffer[Int] = ListBuffer()

    def helper(intial: Int, second: Int, third: Int): Int = {
      print(s"$second ")
      a.addOne(second)
      if (intial <= 1) second
      else {
        helper(intial - 1, third, second + third)
      }
    }

    helper(num, 0, 1)
    a
  }
//
  println("Tail recursion")
  println(fibTailRec(10))
}

//0 1 1 2 3 5 8