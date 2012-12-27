import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

  val appName         = "mq-web"
  val appVersion      = "0.1"
  val appDependencies = Seq(
    "log4j" % "log4j" % "1.2.17"
  )

  lazy val main = PlayProject(appName, appVersion, appDependencies)

}
