package controllers

import play.api._
import play.api.mvc._

class Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def goNext = Action { implicit request: Request[AnyContent] =>
    Redirect("/first")
  }

  def first = Action {
    Ok(views.html.first("this is another page"))
  }
}