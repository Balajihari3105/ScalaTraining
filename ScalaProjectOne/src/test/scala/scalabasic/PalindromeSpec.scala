package scalabasic

import org.scalatest.funsuite.AnyFunSuite

class PalindromeSpec extends AnyFunSuite{
//test function
  test("testing ordinary function"){
    assert(!Palindrome.checkPalindrome(1000))
    assert(Palindrome.checkPalindrome(1001))
    assert(!Palindrome.checkPalindrome(123))

  }
  test("Testing palindrome for a number with zeros"){
    assert(Palindrome.checkPalindrome(0000))// true
  }
  test("testing palindrome for a non palindrome number"){
    assert(!Palindrome.checkPalindrome(1233)) //false => true
  }
  test("testing palindrome for a palindrome number"){
    assert(Palindrome.checkPalindrome(1001)) //true and true
  }

}
