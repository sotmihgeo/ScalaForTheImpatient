// Type these commands into the REPL, or run scala script.scala

import collection.mutable.ArrayBuffer

val sa = Array(1, 0, -2, 5, -3, 0, 5)
var integers = -1
val result = new ArrayBuffer[Int]()

for (i <- 0 until sa.length) {
  if (sa(i) <= 0) result += sa(i)
  else {
    integers += 1
	result.insert(integers, sa(i))
  }
}