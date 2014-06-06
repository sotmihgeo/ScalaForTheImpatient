// Type these commands into the REPL, or run scala script.scala

object Reverse extends App {
  if (args.length > 0)
    for (s <- args.reverse) {
	  if (args.indexOf(s) != args.length - 1)
	    print(" ")
	  print(s)
	}
}