// Type these commands into the REPL, or run scala script.scala

import java.util.Calendar._;
import scala.collection.mutable.LinkedHashMap; 

val days = LinkedHashMap("Sunday" -> SUNDAY,
                         "Monday" -> MONDAY,
                         "Tuesday" -> TUESDAY,
						 "Wednesday" -> WEDNESDAY,
						 "Thursday" -> THURSDAY,
						 "Friday" -> FRIDAY,
						 "Saturday" -> SATURDAY)
	
for ((k, v) <- days) println(k, v) 