package family

import java.time.LocalDate

case class Person(name: String, age: Int, gender: String,
                  fatherName: String, motherName: String,
                  familyName: String,
                  occupation: String ="None",
                  children: List[String]=List(),
                  marriedStatus:String="None",
                 )

