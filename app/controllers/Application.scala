package controllers

import play.api._
import play.api.mvc._
import play.api.data.Form
import play.api.data.Forms._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index())
  }

  def update = Action { implicit request =>
    val x = Form(
      single(
        "value" -> number))
      .bindFromRequest()
      .fold(e => 999999999, success => success)

    Ok(x.toString())
  }
}