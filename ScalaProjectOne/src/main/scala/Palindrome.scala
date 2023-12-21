object Palindrome extends App {

  def checkEquals(i: Int, n1: Int): Boolean = {
    if(i==n1){
      true
    }
    false
  }

  def checkPalindrome(n1:Int):Unit={
  var num=n1
  var n=0
  if(num!=0){
    n=n+checkPalindrome(num%10)
    n
  }
  println(checkEquals(n:Int , n1))

}

  checkPalindrome(1001)
}
