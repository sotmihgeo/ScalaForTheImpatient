// Type these commands into the REPL, or run scala script.scala

import collection.mutable.ArrayBuffer

//Solution1
val a1 = ArrayBuffer(3, 1, -5, -4, 0, 2, -1)

var first1 = true
var n1 = a1.length
var i1 = 0
while (i1 < n1) {
  if (a1(i1) >= 0) i1 += 1
  else {
    if (first1) { first1 = false; i1 += 1 }
    else { a1.remove(i1); n1 -= 1 }
  }
}
println(a1.toString)

//Solution2
val a2 = ArrayBuffer(3, 1, -5, -4, 0, 2, -1)

var first2 = true
val indexes = for (i <- 0 until a2.length if first2 || a2(i) >= 0) yield {
  if (a2(i) < 0) first2 = false; i
}

for (i <- 0 until indexes.length) a2(i) = a2(indexes(i))
a2.trimEnd(a2.length - indexes.length)

println(a2.toString)

//Solution3
val a3 = ArrayBuffer(3, 1, -5, -4, 0, 2, -1)

val negatives = for (i <- 0 until a3.length if a3(i) < 0) yield i
val lastNegatives = negatives.reverse.dropRight(1)

for (i <- 0 until lastNegatives.length) a3.remove(lastNegatives(i)) 

println(a3.toString)

/* 
Solution2 is clearly better than Solution1 
Solution3 is actually worse than Solution1 because, beside the operations in 1 (traverse the whole array and using remove at arbitrary position) it creates a new array, reverse it and then traverse it.
*/