object FibonaciSeries extends App{
//fibanoci function

def fibonaciSeries(num:Int)={
  var num1=0
  var num2=1
  var sum=0

  println(s"Fibonacci series upto $num :")
  for(i <- 0 until num){
    print(num1+" ")
    sum=num1+num2
    num1=num2
    num2=sum
  }
}
  fibonaciSeries(10)

}
