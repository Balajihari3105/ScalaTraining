package family

import check1.ObMain


object Main extends App {
  private val father = Parent("Rajesh", 50, List(Person("Gopal", 21), Person("Revathi", 23)))
  private val mother = Parent("Renu", 49, List(Person("Gopal", 21), Person("Revathi", 23)))
  private val child1 = Children("Gopal", 21, List(father, mother))
  private val child2 = Children("Revathi", 18, List(father, mother))
  val family1 = Family(father, mother, List(child1, child2))

  AddEntry.addChild(child1)
  AddEntry.addChild(child2)
  AddEntry.addFamily(family1)
  AddEntry.addParent(father)
  AddEntry.addParent(mother)

  println(s"The List of Childrens ${AddEntry.childrenList}")

  println(s"The List of Parents ${AddEntry.parentList}")

  println(s"The List of Couples ${AddEntry.familyList}")
}
