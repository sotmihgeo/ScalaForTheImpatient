// Type these commands into the REPL, or run scala script.scala

class UnitConversion {
  def convert(quantity: Int, conversionFactor: Double): Double = quantity * conversionFactor
}

object InchesToCentimeters extends UnitConversion {
  def convert(inches: Int): Double = convert(inches, 2.54) 
}

object GallonsToLiters extends UnitConversion {
  def convert(gallons: Int): Double = convert(gallons, 3.78541)
}

object MilesToKilometers extends UnitConversion {
  def convert(miles: Int): Double = convert(miles, 1.60934)
}

println(InchesToCentimeters.convert(10))
println(GallonsToLiters.convert(10))
println(MilesToKilometers.convert(10))