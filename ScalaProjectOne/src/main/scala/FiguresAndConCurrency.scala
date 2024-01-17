import scala.annotation.tailrec
import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.DurationInt
import scala.util.{Failure, Success}
object FiguresAndConCurrency extends App{

  val listFutures: List[Future[Int]] = List(Future(1), Future(2), Future(3))

  @tailrec
  def combineFutures(listFutures: List[Future[Int]], sum: Future[Int] = Future.successful(0)): List[Future[Int]] = {
    listFutures match {
      case Nil => List(sum)
      case head :: tail => combineFutures(tail, sumFuture(sum, head))
    }
  }

  private def sumFuture(f1: Future[Int], f2: Future[Int]): Future[Int] = {
    for {
      val1 <- f1
      val2 <- f2
    } yield val1 + val2
  }

  val result: List[Future[Int]] = combineFutures(listFutures)
  println(result)

  // Print the result
//  Await.result(Future.sequence(result.map(future => future.map(x => println(s"Sample output: $x")))), 5.seconds)





//  def combineFutureList(list: List[Future[Int]]):Future[Int]={
//    Future[list.map(_.)]

//  }
//  def sumFutures(futures: List[Future[Int]]): Future[Int] = {
//    Future(futures.map(Future(_))).map(value => value.sum)
//  }





//  step 1;
//val fval =Future{
//  Thread.sleep(2000)
//  "It is the time to learn Future"+1/0
//}
//  println(fval.isCompleted)
//  println(fval.value)
//  println(Thread.sleep(2001))
//  println(fval.isCompleted)
//  println(fval.value)

//  <--- lesson 2-->


//  val fval1 = Future{
//    Thread.sleep(2000)
//    "Helo,this scala "
//  }
//  val fval2 = Future{
//    Thread.sleep(2001)
//    "ok"
//  }
//  // combine the result of future
//  val result1 = for {
//    val1 <- fval1
//    val2 <- fval2
//  } yield val1+val2
//  println(result1.isCompleted)
//  println(Thread.sleep(3000))
//  println(result1.isCompleted)
//  println(result1.value)


  //  <--- lesson 2=3--> using filter
//    val fval4 = Future{
//      Thread.sleep(2000)
//      "ok"
//    }
//  val checked = fval4.filter(s=> !s.isEmpty)
//  println(checked.isCompleted)
//  Thread.sleep(2003)
//  println(checked)
//  println(fval4.isCompleted)


  //  using Collect which is simialr to filter

//  val validate=fval4.collect{
//    case s  if(!s.isEmpty) => "empty"
//    case r=> r
//  }
//    println(validate.isCompleted)
//    Thread.sleep(2003)
//    println(validate)
//    println(fval4.isCompleted)

//  val listFutures = List(Future(1),Future(2),Future(3))
//  def combineFuture(listFutures : List[Future[Int]])(resultantList: List[Future[Int]]=List.empty, sum : Future[Int]=Future(0)):List[Future[Int]]={
//    listFutures match {
//      case Nil => resultantList
//      case head: tail =>  for {
//        val1 <- sum
//        val2 <- head
//      } yield val1+val2
//    }
//  }

  //<--- call backd -->
//  val fval5 = Future{
//          "ok"
////    throw new Exception("error")
//        }
//  fval5 onComplete{
//    case Success(s) => println(s)
//    case Failure(e) => println("error"+e.getMessage)
//  }
//
//  if(fval5.isCompleted == false){
//    Thread.sleep(2000)
//  }

  // <-
}
