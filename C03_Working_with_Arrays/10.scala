// Type these commands into the REPL, or run scala script.scala

import java.awt.datatransfer._
import scala.collection.JavaConversions.asScalaBuffer
import scala.collection.mutable.Buffer

val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
val b: Buffer[String] = flavors.getNativesForFlavor(DataFlavor.imageFlavor)

/* 
Why this obscure class? 

I dont really understand the question, but... i guess it's designed for interoperability with other JVM languages...
*/