// Type these commands into the REPL, or run scala script.scala

import scala.collection.Map;
import scala.collection.JavaConversions.propertiesAsScalaMap

val props: Map[String, String] = System.getProperties()

//val maxKeyLength = props.keys.reduceLeft((x, y) => if (x.length > y.length) x else y).length
val maxKeyLength = props.keys.map(_.length).max
//for ((k, v) <- props) Console.println(k.padTo(maxKeyLength, " ").mkString + "|" + v)
for ((k, v) <- props) printf("%-" + maxKeyLength + "s|%s\n", k, v)