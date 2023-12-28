import org.scalatest.funsuite.AnyFunSuite

class StringPalindromeSpec extends AnyFunSuite{

  test("String plandrome checks for empty string"){
    assert(StringPalindrome.checkStringPalindrome(""))
  }

  test("String plandrome checks for an single string"){
    assert(StringPalindrome.checkStringPalindrome("a"))
  }

  test("String plandrome checks for mixed string string"){
    assert(StringPalindrome.checkStringPalindrome("noon"))

    assert(StringPalindrome.checkStringPalindrome("racecar"))
  }

  test("Steing palandrome check test case 1 not a palindrome string"){
    assert(!StringPalindrome.checkStringPalindrome("Balaji"))
    assert(!StringPalindrome.checkStringPalindrome("123"))
  }

  test("Steing palandrome check test case 2 a palindrome string"){
    assert(StringPalindrome.checkStringPalindrome("111"))
    assert(StringPalindrome.checkStringPalindrome("1001"))
    assert(StringPalindrome.checkStringPalindrome("BOB"))
  }


}
