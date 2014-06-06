// Type these commands into the REPL, or run scala script.scala

object Conversions {
  def inchesToCentimeters(inches: Int) = inches * 2.54
  def gallonsToLiters(gallons: Int) = gallons * 3.78541
  def milesToKilometers(miles: Int) = miles * 1.60934
}

println(Conversions.inchesToCentimeters(10))
println(Conversions.gallonsToLiters(10))
println(Conversions.milesToKilometers(10))