
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Admin/IdeaProjects/projectPlay/conf/routes
// @DATE:Mon Oct 22 13:54:20 BST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
