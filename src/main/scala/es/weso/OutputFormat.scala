package es.weso
import es.weso.utils.named._

sealed trait OutputFormat extends Named {
    def start: String
    def end: String 
    def sep: String
}
object OutputFormat {
    case object JSON extends OutputFormat { 
        override val name ="JSON" 
        override def start = "[\n"
        override def end   = "\n]"
        override def sep   = ",\n"
    }
    case object PlantUML extends OutputFormat { 
        override val name = "PlantUML"
        override def start = "@startuml\n"
        override def end   = "\n@enduml"
        override def sep   = "\n"
    }

    val availableOutputFormats = List(JSON, PlantUML)
}