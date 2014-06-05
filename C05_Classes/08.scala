// Type these commands into the REPL, or run scala script.scala

class Car(val manufacturer: String, val model: String, val year: Int = -1, var licensePlate: String = ""){
  def this(manufacturer: String, model: String, year: Int){
    this(manufacturer, model, year, "")
  }
  def this(manufacturer: String, model: String, licensePlate: String) {
    this(manufacturer, model, -1, licensePlate)
  }
  def this(manufacturer: String, model: String) {
    this(manufacturer, model, -1, "")
  }
}

val c1 = new Car("Volksvagen", "Golf", 2007, "GL 83 MCK")
val c2 = new Car("Volksvagen", "Golf", 2007)
val c3 = new Car("Volksvagen", "Golf", "GL 83 MCK")
val c4 = new Car("Volksvagen", "Golf")

println(c1.manufacturer + " " + c1.model + " " + c1.year + " " + c1.licensePlate)
println(c2.manufacturer + " " + c2.model + " " + c2.year + " " + c2.licensePlate)
c2.licensePlate = "new license plate"
println(c2.manufacturer + " " + c2.model + " " + c2.year + " " + c2.licensePlate)
println(c3.manufacturer + " " + c3.model + " " + c3.year + " " + c3.licensePlate)
println(c4.manufacturer + " " + c4.model + " " + c4.year + " " + c4.licensePlate)

/*i guess the best slution is to use just one constructor with default values for
year and license plate and when a new object is created we can set the params 
by name in the constructor
For the problem in case probably i should have done a class with no parameters in the primary constructor...
yet, when i overload, the first time i usualy make the method with the longest list of params */