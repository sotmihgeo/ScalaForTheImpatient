// Type these commands into the REPL, or run scala script.scala

def lteqgt(values: Array[Int], v: Int) =
  (values.count(_ < v), values.count(_ == v), values.count(_ > v))
  
//Console.println(lteqgt(Array(7, 2, 1, 5, 3, 4), 3))