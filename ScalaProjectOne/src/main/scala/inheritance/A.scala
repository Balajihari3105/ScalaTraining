package inheritance
class A extends B with C{
  override def cCall(): Unit = {
    println("c in a")
  }


}
abstract class B{
  def bCall(): Unit = {
    println("B")
  }
}
trait C{
  def cCall(): Unit = {
    println("C")
  }
}

object inHeritance extends App {
  val a=new A()
  print(a.bCall())

  print(a.cCall())
}