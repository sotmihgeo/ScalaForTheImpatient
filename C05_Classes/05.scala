// Type these commands into the REPL, or run scala script.scala

import scala.reflect.BeanProperty

class Student(@BeanProperty var id: Long, @BeanProperty var name: String)

/* the methods generated
public class Student {
  private long id;
  private java.lang.String name;
  public long id();
  public void id_$eq(long);
  public void setId(long);
  public java.lang.String name();
  public void name_$eq(java.lang.String);
  public void setName(java.lang.String);
  public long getId();
  public java.lang.String getName();
  public Student(long, java.lang.String);
}*/

val s1 = new Student(1, "Mihai")
println(s1.getId)
println(s1.getName)
s1.setName("M_ha_")
println(s1.getName)