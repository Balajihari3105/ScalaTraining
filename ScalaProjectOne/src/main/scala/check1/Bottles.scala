package check1

import scala.annotation.tailrec

object Bottles extends App {

  /*99 bottles of beer on the wall, 99 bottles of beer.
  Take one down and pass it around, 98 bottles of beer on the wall.

   */
  def recite(num: Int, i:Int): Int = {

    num match {
      case num if (num > 0 && i>0 )=>println(s"$num bottles of beer on the wall, $num bottles of beer.\nTake one down and pass it around, ${num - 1} bottles of beer on the wall.\n\n")
        recite(num - 1,i-1)
      case num if(num==0) => println("No more bottles of beer on the wall, no more bottles of beer.\nTake one down and pass it around, 99 bottles of beer on the wall.")
        0
//      case _ =>0
    }
  }

  recite(1,1)

}
