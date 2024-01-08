package check1

object SpaceAge extends App {
  def onEarth(age: Double): Double = {
    ageOfPlanet(0.2408467,  age)
  }

  def onVenus(age: Double): Double = ageOfPlanet(0.61519726, age)

  def onMercury(age: Double): Double = ageOfPlanet(1, age)

  def onMars(age: Double): Double = ageOfPlanet(1.8808158, age)

  def onJupiter(age: Double): Double = ageOfPlanet(11.862615, age)

  def onSaturn(age: Double): Double = ageOfPlanet(29.447498, age)

  def onUranus(age: Double): Double = ageOfPlanet(84.016846, age)

  def onNeptune(age: Double): Double = ageOfPlanet(164.79132, age)

  def ageOfPlanet(orbitalAge: Double, age: Double): Double = {
    val overAllYear = orbitalAge * 60 * 60 * 24 * 365.25
    age / overAllYear
  }

  println(onEarth(1000000000))
  println(onMercury(2134835688))
  println(onVenus(189839836))
  println(onMars(2.329871239E9))
}
