package Main

import scala.io.StdIn
import RunPro.read_Data
import convert.JsonConsole.{formJSONData, jsonArray, v_data}
import spray.json.JsArray

object RunPro extends App{
  val readString:String =StdIn.readLine()
   def read_Data():Any= {
  readString match {
    case _ if readString.contains ("A ->") =>
      val data:List[String]=readString.split("->").toList
      formJSONData(data(1))
      read_Data()

    case _ if(readString.charAt(0)=='R')=>
      if(v_data.nonEmpty){
        println(jsonArray.prettyPrint)
        jsonArray=JsArray.empty
        v_data=v_data.empty
        read_Data()
      }
      else {
        println("JSON is Empty")
        read_Data()
      }
    case _=> println("Invalid user")
      read_Data()
  }
}
  read_Data()
}
