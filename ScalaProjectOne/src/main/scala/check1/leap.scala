package check1

object Leap extends App{
  def leapYear(year: Int): Boolean = {
    if(year %4==0 && year %100 !=0 || year %400==0) true
    else
      false
  }
println(leapYear(2000))
val list=List(1,2,3,4)
3::list

}