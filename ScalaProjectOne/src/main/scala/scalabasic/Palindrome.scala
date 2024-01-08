package scalabasic

object Palindrome extends App {

  def checkPalindrome(n: Int): Boolean = {
    var num = n
    var rev = 0
    while (num != 0) {
      rev = (rev * 10) + num % 10
      num = num / 10
    }
    if (n == rev) true
    else
      false
  }

  def checkNum(num: Int) = {
    def helper(n: Int, rev: Int): Int = { //num= 123    rev=4
      if (n == 0) {
        rev
      }
      else {
        helper(n / 10, rev * 10 + n % 10) //1234/10= 123, 0*10 + 4= 0+4 =4   helper(123,4)
                                  // 123/10=12, 4*10+ 3 =43   helper(12,43)
                                  // 12/10 =1, 43*10 + 2= 432   helper(1,432)
                                 // 1/10=0, 432*10 + 1 =4321 helper(0,4321)

      }
    }

    val revrsedNum = helper(num, 0) //4321
    if (num == revrsedNum) true //1234 ==4321
    else false
  }

  println(s"checking the palindorme ${checkNum(121)}") //false


  //  println(checkPalindrome(1001))
}
