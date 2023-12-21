object Palindrome extends App {

  def checkPalindrome(n: Int): Boolean = {
    var num = n
    var rev = 0
    while (num != 0) {
      rev = (rev * 10) + num % 10
      num = num / 10
    }
    if(n==rev) true
    else
      false
  }


println(checkPalindrome(1001))
}
