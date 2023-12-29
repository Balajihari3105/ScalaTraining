package family

object Main extends App {
  val alice = Person("Alice", 51)
  val bob = Person("Bob", 80)
  val charlie = Person("Charlie", 21)
  val dave = Person("Dave", 23)

  val charlieTree =  FamilyTree(charlie)
  val daveTree = FamilyTree(dave)

  val bobTree =  FamilyTree(bob, List(charlieTree, daveTree))
  val familyTree =  FamilyTree(alice, List(bobTree))

  val familyList=new FamilyList
  familyList.addFamily(familyTree)

  familyList.printFamily()


}
