// Type these commands into the REPL, or run scala script.scala

import collection.JavaConversions.asScalaIterator
//import collection.mutable.Buffer

val tz: Array[String] = java.util.TimeZone.getAvailableIDs

val prefix = "America/"
tz.filter(_.startsWith(prefix)).map(_.stripPrefix(prefix)).sortWith(_.compareTo(_) < 0)