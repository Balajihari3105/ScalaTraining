package leetcode

import scala.annotation.tailrec

object Solution extends App{

  private def isPalindrome(x: Int): Boolean = {
    checkNum(x)

  }


  def checkNum(num: Int): Boolean = {

    @tailrec
    def helper(n: Int, rev: Int): Int = {

      if (n == 0) {
        rev
      }
      else {
        helper(n / 10, rev * 10 + n % 10)
      }
    }
    if(num<0) return false
    else if(num ==  helper(num,0)) return true
    else return false
  }
println(isPalindrome(122))


}
