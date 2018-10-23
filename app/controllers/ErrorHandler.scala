package controllers

import play.api.http.HttpErrorHandler
import play.api.mvc._
import play.api.mvc.Results._
import scala.concurrent._
import javax.inject.Singleton;

@Singleton
class ErrorHandler extends HttpErrorHandler {

  def onClientError(requestHeader: RequestHeader, statusCode: Int,
                    message: String) = {
    Future.successful(
      Status(statusCode)("A client error occurred: " +
        message)
    )
  }

  def onServerError(requestHeader: RequestHeader,
                    exception: Throwable) = {
    Future.successful(
      InternalServerError("A server error occurred: " +
        exception.getMessage)
    )
  }
}
