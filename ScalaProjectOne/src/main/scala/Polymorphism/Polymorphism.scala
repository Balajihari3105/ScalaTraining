package Polymorphism

object Polymorphism extends App {


  // we can mix or implement more than one trait but you can't mix or implement multiple classes


  // Homework
  // How scala avoid Diamond problem

  // what is Polymorphism => Poly : Many::::   Morphism : Forms

  //  => Manyforms => When a function has many/multiple forms: Polymorphism


  //  1. Subtyping
  // 2. Generic or parametric
  // 3. Ad-hoc

  /**
   * 1. Subtyping: In subtyping, an instance of a subclass can be passed to a base class
   * other words: Whenwe are passing the instace of a child class to the parent class
   * The subtyping relation is written as T<: Shape, to mean that any argument of type T can be safetly
   * used in a context where a term of type Shape is expected
   *
   *
   *
   *
   * 2. Parametric:   Generic
   *
   * 3. Ad-hoc:  Similar to generic but ad-hoc: can take different types of argument:
   * Compiler switches between varios code executions relying upon the type of input a method receives.
   *
   * */


  def reverse1[A](list: List[A]): List[A] = {
    list.grouped(2).flatMap(_.reverse).toList
  }

  println(reverse1(List(1,23,4,5,6)))


  case class Complex(a: Double, b: Double) {
    def +(result: Complex): Complex = Complex(a + result.a, 2 + result.b)

    def -(result: Complex): Complex = Complex(a - result.a, 2 - result.b)

    override def toString: String = s" $a +${b}"
  }


  val complex1 = Complex(8.0, 3.0)
  val complex2 = Complex(6.0, 2.0)


  val sum = complex1 + complex2
  val diff = complex1 - complex2


  println(s"::sum ::  $sum")
  println(s"::diff ::  $diff")
}
