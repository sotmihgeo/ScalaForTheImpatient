// Type these commands into the REPL, or run scala script.scala

var scores = new scala.collection.immutable.TreeMap[String, Int]

val in = new java.util.Scanner(new java.io.File("02.txt"))
while (in.hasNext()) {
  val token = in.next()
  scores = scores + (token -> (scores.getOrElse(token, 0) + 1))
}

for ((t, a) <- scores) Console.print(t, a)