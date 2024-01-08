package Polymorphism

object Shapes extends App{

  trait Shape {
    def area: Double

  }
  class Square(side: Double) extends Shape {
    override def area: Double = side * side
  }

  class Circle(radius: Double) extends Shape {
    override def area: Double = Math.PI * radius * radius
  }

  def printArea[T <: Shape](shape: T): Double = (math.floor(shape.area) * 100) / 100


  case class Ractangle(leng: Double, breath: Double) {
    def area = leng * breath
  }

  val square = new Square(10.0)
  val circle = new Circle(12.0)
  //  val ractangle = Ractangle(12.0, 12.0)



  println(s"::Square area::  ${printArea(square)}")
  println(s"::circle area::  ${printArea(circle)}")
  // println(s"::Ractangle area::  ${printArea(ractangle)}")

}
