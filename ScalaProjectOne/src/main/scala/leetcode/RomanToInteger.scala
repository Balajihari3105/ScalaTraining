package leetcode
object RomanToInteger extends App{

  def converterHelper(sList: List[Char], acc: Int):Int = {
    val romanMap:Map[Char,Int] = Map('I'->1,'V'->5,'X'->10,'L'->50,'C'->100,'D'->500,'M'->1000)
    sList match{
      case head :: next :: tail =>
        val headValue = romanMap.getOrElse(head, 0)
        val nextValue = romanMap.getOrElse(next, 0)

        if (headValue < nextValue)
          converterHelper(tail, acc + nextValue - headValue)
        else
          converterHelper(next :: tail, acc + headValue)
      case head :: tail => converterHelper(tail,acc+romanMap.getOrElse(head,0))
      case Nil => acc
    }
  }

  def  romanToInteger(str : String): Int = {

    converterHelper(str.toList,0)
  }
  println(romanToInteger("MCMXCIV"))

}