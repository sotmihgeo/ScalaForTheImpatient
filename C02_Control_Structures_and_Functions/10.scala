// Type these commands into the REPL, or run scala script.scala

def xPowN(x: Double, n: Int): Double = {
  if (n < 0) 1 / xPowN(x, -n)
  else if (n == 0) 1
  else if ((n % 2) == 1) x * xPowN(x, n - 1)
  else xPowN(x, n / 2) * xPowN(x, n / 2)
}

println(xPowN(2, 5)) //32
println(xPowN(3, 3)) //27
println(xPowN(2, 6)) //64