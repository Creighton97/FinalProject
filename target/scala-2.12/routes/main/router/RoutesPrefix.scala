
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/FinalDay-master/conf/routes
// @DATE:Mon Apr 23 11:19:10 IST 2018


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
