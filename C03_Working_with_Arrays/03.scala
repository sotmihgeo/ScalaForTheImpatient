// Type these commands into the REPL, or run scala script.scala

val sa = Array(1, 2, 3, 4, 5)
val l = sa.length

for (i <- 0 until l) yield {
  if (i % 2 != 0) sa(i - 1)
  else if (i + 1 >= l) sa(i)
  else sa(i + 1)
}