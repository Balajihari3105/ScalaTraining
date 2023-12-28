package check1

object Family extends App {


  var peoples: List[Person] = List()
  peoples :+= Person("Gokul", 5, "Male", "Suresh", "Ramya", "family1")
  peoples :+= Person("Suresh", 51, "Male", "Kamala", "Rathika", "BusinessMan","Married", List("Hari", "sweatha"), "family1")
  peoples :+= Person("Ramesh", 53, "Male", "Married", "Kamala", "Rathika", "Electrican", List("Gowri"), "family1")
  peoples :+= Person("Rani", 21, "Female", "None", "Ramesh", "Rathika", "Nurse", List("Hari", "sweatha"), "family1")
//  peoples :+= Person("Ramesh", 51, "Male", "None", "Kamala", "Rathika", "Pilot", List("Hari", "sweatha"), "family1")
//  peoples :+= Person("Ramesh", 51, "Male", "None", "Kamala", "Rathika", "Nurse", List("Hari", "sweatha"), "family1")
//  peoples :+= Person("Ramesh", 51, "Male", "None", "Kamala", "Rathika", "Mechanic", List("Hari", "sweatha"), "family1")
//  peoples :+= Person("Ramesh", 51, "Male", "None", "Kamala", "Rathika", "Plumber", List("Hari", "sweatha"), "family1")

  val name = "Ramesh"


}