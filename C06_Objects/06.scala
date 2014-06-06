// Type these commands into the REPL, or run scala script.scala

object CardSuits extends Enumeration {
  type CardSuits = Value
  val Club = Value("Club")
  val Diamond = Value("Diamond")
  val Heart = Value("Heart")
  val Spade = Value("Spade")
}

import CardSuits._

CardSuits.values foreach println
//println(Club.toString)
//println(CardSuits.Diamond.toString)