object PatternMatchClass extends App{
 val student1 = Student("Balaji",1)
  val students=List(Student("Balaji",1),Student("Dhanush",2),Student("gopal",3))
  def studentMatch(list:List[Student]):List[String]={
    val l: List[String] = List()
    list match{
      case Nil => l
      case head:: tail => l.appended( head.name) :::  studentMatch(tail)
    }
  }

  println(studentMatch(students))
}
case class Student(name:String,id:Int)
