package family


case class FamilyTree(root: Person, children: List[FamilyTree] = List.empty) {


  def printTree(indent: Int = 0): Unit = {
    println("  " * indent + root.name + s" (Born: ${root.age})")
    children.foreach(_.printTree(indent + 1))
  }
}
