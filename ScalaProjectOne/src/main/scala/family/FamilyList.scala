package family

class FamilyList {

  private var familyList: List[FamilyTree] = List.empty

  def addFamily(family: FamilyTree): Unit = {
    familyList = family +: familyList
  }

  def printFamily() {
    familyList.foreach(f => println(s" ${f.root.name} Family: $f")

    )
  }
}
