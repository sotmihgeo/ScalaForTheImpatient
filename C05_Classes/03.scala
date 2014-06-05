// Type these commands into the REPL, or run scala script.scala

class Time(val hours: Int, val minutes: Int) {
  //if ((hours < 0) || (hours > 23))
    //throw new IllegalArgumentException("hours must be between 0 and 23")
  require((hours >= 0) && (hours < 24), "hours must be between 0 and 23")	
  //if ((minutes < 0) || (minutes > 59))
    //throw new IllegalArgumentException("minutes must be between 0 and 59")
  require((minutes >= 0) && (minutes < 60), "minutes must be between 0 and 59")	

  def before(other: Time): Boolean = (hours * 60 + minutes) < (other.hours * 60 + other.minutes)
}

val t1 = new Time(5, 30)
val t2 = new Time(6, 55)
println(t2.before(t1))