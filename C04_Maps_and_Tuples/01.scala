// Type these commands into the REPL, or run scala script.scala

val preturi: scala.collection.immutable.Map[String, Double] = Map("Paine" -> 0.8d, "Coca Cola" -> 6.5d, "Covrigei" -> 3d)

for ((k, v) <- preturi) yield (k, (100 - 10) * v / 100) //i dont know why when i write (100 - 10) / 100 * v the result is 0.0 ...