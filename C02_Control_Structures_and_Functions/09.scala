// Type these commands into the REPL, or run scala script.scala

def product(s: String): Long = {
  if (s == "") 1
  else s.head * product(s.tail)
}

println(product("Mihai"))