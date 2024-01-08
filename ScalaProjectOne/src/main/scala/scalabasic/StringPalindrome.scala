package scalabasic

object StringPalindrome extends App {

  def checkStringPalindrome(str: String):Boolean = {
    def helper(s: String, size: Int, rev: String): String = {

      if (size == 0) {
//        println(rev)
        rev
      }
      else {
        helper(s, size = size - 1, rev=rev+s.charAt(size-1))
      }
    }
    val r =helper(str, str.length, "")
    if(r.contentEquals(str))true
    else false
  }

 println( checkStringPalindrome("www"))

}
