// Type these commands into the REPL, or run scala script.scala

//for an Array
import util.Sorting.quickSort

val a = Array(2, 8, 5, 0, 3)
quickSort(a)
a.reverse

//for an ArrayBuffer

import collection.mutable.ArrayBuffer

val ab = ArrayBuffer[Int](2, 8, 5, 0, 3)
ab.sortWith(_ < _).reverse
