package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def generateEvent = Action {
    Ok("generated kafka event")
  }

  def showEvents = Action {
    Ok("event list")
  }

}