package check1

object matchPratice extends  App {
  def twofer(name: String=""): String ={
    name match {
      case name if !name.isEmpty=> s"one for $name, one for me."
      case _ => s"one for you, one for me."
    }
  }
  println(twofer("Balaji"))
  println(twofer("Govind"))
  println(twofer())
}
