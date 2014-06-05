// Type these commands into the REPL, or run scala script.scala

class Time(val hours: Int, val minutes: Int){
  require((hours >= 0) && (hours < 24), "hours must be between 0 and 23")
  require((minutes >= 0) && (minutes < 60), "minutes must be between 0 and 59")
  
  def minutesSinceMidnight = hours * 60 + minutes
  def before(other: Time): Boolean = minutesSinceMidnight < other.minutesSinceMidnight
}

val t1 = new Time(5, 30)
val t2 = new Time(6, 55)
println(t1.before(t2))