// Type these commands into the REPL, or run scala script.scala

val scores = new scala.collection.mutable.HashMap[String, Int]

val in = new java.util.Scanner(new java.io.File("02.txt"))
while (in.hasNext()) {
  val token = in.next()
  scores(token) = scores.getOrElse(token, 0) + 1
}

for ((t, a) <- scores) Console.print(t, a)