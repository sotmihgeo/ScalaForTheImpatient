// Type these commands into the REPL, or run scala script.scala

def product(s: String) = {
  s.foldLeft(1L)((a, b) => a * b)
}

println(product("Mihai"))