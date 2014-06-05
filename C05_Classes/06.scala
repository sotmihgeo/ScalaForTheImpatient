// Type these commands into the REPL, or run scala script.scala

class Person(var age: Int) {
  if (age < 0) age = 0
}

val p1 = new Person(-21)
println(p1.age)