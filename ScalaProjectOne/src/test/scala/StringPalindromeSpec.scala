import org.scalatest.funsuite.AnyFunSuite

class StringPalindromeSpec extends AnyFunSuite{

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
