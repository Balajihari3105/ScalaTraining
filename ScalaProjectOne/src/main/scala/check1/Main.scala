package check1

object Main extends App {

  class Animal {
    val name: String = "Animal"
    val age:Int=0
    def show(): Unit = {
      println("The animal class")
    }
  }

  class Dog(override val name: String) extends Animal {
  }
  private val dog = new Dog("dog")
  print(s"dog name:${dog.name}")
  print(dog.show())
  println(dog.age)
//abstract

  abstract class wiildAnimal( name:String)extends Animal {
println(s"Anmil wild $name")
  }
  class Lion(override val name:String) extends wiildAnimal(name:String){
    println(s"Animal Lion $name s")
  }

  println(new Lion("Simba").name)

  trait Car{
    def carName(name:String) :Unit
def brandName(): Unit = {
  println("Hyndai")
}
  }
  val car1= new Car{
    def carName(name:String): Unit = {
      println(s"car name $name")
    }
  }
  println(car1.carName("li"))
  car1.brandName()

  try{
    val name:String=null
    println(name.length())
  }
  catch {
    case e:Exception =>println( "Null Pointer Error")
  }
val aList =List(1,2,3,4,5)
  val headList = aList.head
  val tailList =aList.tail
  println(s"head ${headList}, tail:${tailList} ")
  println(aList.hashCode())
   val aListreverse=aList.reverse
  println(aListreverse.hashCode())

  abstract class myList[T]{
    def head : T
    def tail : List[T]
  }
  class arrList[T](val l:List[T]) extends myList[T] {

    override def head: T = l.head

    override def tail: List[T] = l.tail
  }

  val list=new arrList(List(1,2,3,4,56,6))
  println(list.l)
  println(list.head)
  println(list.tail)
}
