import sbt._
object Dependencies{

   val sprayJsonVersion="1.3.6"
   val spray= "io.spray" %% "spray-json" % sprayJsonVersion

  def compileDependencies:ModuleID=spray
}
