// Type these commands into the REPL, or run scala script.scala

class Counter {
  private var value = 0 
  def increment(inc: Int = 1) {
    if (Int.MaxValue - value >= inc)
      value += inc
    else
      value = inc - (Int.MaxValue - value) - 1	
  } 
  def current = value
}

val myCounter = new Counter
myCounter.increment(Int.MaxValue)
println(myCounter.current)
myCounter.increment()
println(myCounter.current)
myCounter.increment(5)
println(myCounter.current)