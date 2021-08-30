package data
import Dependecies._
import spray.json.DefaultJsonProtocal._
import spray.json.RootJsonFormat

case class Trainer(name:String,id:Int)

object Trainer{
  implicit val rootJsonFormat:RootJsonFormat[Trainer]= JsonFormat1(Trainer)
}