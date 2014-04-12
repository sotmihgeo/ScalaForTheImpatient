// Type these commands into the REPL, or run scala script.scala

def sa = Array(1, 2, 3, 4, 5)
val l = sa.length
var swap = 0

for (i <- 0 until l by 2) {
  if (i + 1 < l) {
    swap = sa(i)
	sa(i) = sa(i + 1)
	sa(i + 1) = swap
  } //else sa(i) = sa(i)  
}