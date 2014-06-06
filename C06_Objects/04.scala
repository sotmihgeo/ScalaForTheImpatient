// Type these commands into the REPL, or run scala script.scala

class Point private (val x: Int, val y: Int)

object Point {
  def apply(x: Int, y: Int) = new Point(x, y)
}

println(Point(5, 6).y)
println(Point(7, 6).x)