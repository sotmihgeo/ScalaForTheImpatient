// Type these commands into the REPL, or run scala script.scala

class Person(val fullName: String) {
  def firstName = fullName.split(" ").head
  def lastName = fullName.split(" ").last
}

val p1 = new Person("Mihai Sotirca")
println(p1.lastName)
println(p1.firstName)
println(p1.fullName)

/*i guess it should be a val (read only) so you can access easily the fullName.
It can't be var because the name of a person doesn't change and,
i don't really know what a plain parameter means, but there is no advantage in using
a private param because to obtain the full name you have to concatenate...*/