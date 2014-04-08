// Type these commands into the REPL, or run scala script.scala

def signum(value: Int) = {
  if (value < 0) -1
  else if (value == 0) 0
  else 1
}

println(signum(-23)) //-1
println(signum(0))   //0
println(signum(34))  //1