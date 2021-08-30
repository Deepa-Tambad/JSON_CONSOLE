package convert
import spray.json.{JsArray,JsValue,enrichAny}
import data.Trainer

object JsonConsole {
  var jsonArray:JsArray=JsArray.empty
  var v_data:Vector[JsValue]=Vector.empty
  def formJSONData(readString:String):Unit={
    readString.split(",") match {
      case Array(name,id) =>
        val JSONofArray:Trainer=Trainer(name.replace("(",""),id.replace(")","").toInt)
        val jsonValue:JsValue =JSONofArray.formJSONData
        v_data = v_data.appended(jsonValue)
        jsonArray = JsArray.apply(v_data)
      case _ =>println("Input Invalid")
    }
  }
}
