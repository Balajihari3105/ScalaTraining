package family

import scala.collection.mutable.ListBuffer

object AddEntry {
  val childrenList: ListBuffer[Children] = ListBuffer()
  val parentList: ListBuffer[Parent] = ListBuffer()

  val familyList: ListBuffer[Family] = ListBuffer()

  def addFamily(couple: Family): Unit = {
    familyList.addOne(couple)
  }

  def addParent(parent: Parent): Unit = {
    parentList.addOne(parent)
  }

  def addChild(children: Children): Unit = {
    childrenList.addOne(children)
  }

}
