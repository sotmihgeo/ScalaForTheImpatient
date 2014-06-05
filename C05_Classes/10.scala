// Type these commands into the REPL, or run scala script.scala

class Employee(val name: String, var salary: Double) {

  def this() { this("John Q. Public", 0.0) }
  
}

class Employee(val name: String = "John Q. Public", var salary: Double = 0.0)

class Employee(n: String, s: Double) {

  def this() { this("John Q. Public", 0.0) }
  
  val name = n
  var salary = s
}

/* I prefer the second form - it is the shortest... */