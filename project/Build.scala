import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

  val appName         = "mq-web"
  val appVersion      = "0.1"
  val appDependencies = Seq()

  lazy val main = PlayProject(appName, appVersion, appDependencies)

}