package Polymorphism

import org.scalatest.funsuite.AnyFunSuite

class PolymorphismSpec extends AnyFunSuite{

  test("paired reverse for a list"){
    assert(Polymorphism.reverse1(List(1,2,3,4,6,0))==List(2,1,4,3,0,6))
  }

}
