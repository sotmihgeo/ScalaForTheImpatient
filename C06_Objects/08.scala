// Type these commands into the REPL, or run scala script.scala

object RGBCubeColors extends Enumeration {
  type RGBCubeColors = Value
  val Black = Value(0x000000)
  val Blue = Value(0x0000ff)
  val Green = Value(0x008000)
  val Cyan = Value(0x00ffff)
  val Red = Value(0xff0000)
  val Magenta = Value(0xff00ff)
  val Yellow = Value(0xffff00)
  val White = Value(0xffffff)
}