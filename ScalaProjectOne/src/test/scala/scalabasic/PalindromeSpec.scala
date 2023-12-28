import org.scalatest.funsuite.AnyFunSuite

class PalindromeSpec extends AnyFunSuite{
//test function
  test("testing ordinary function"){
    assert(!Palindrome.checkPalindrome(1000))
    assert(Palindrome.checkPalindrome(1001))
    assert(!Palindrome.checkPalindrome(123))

  }
}
