import sbt._

object Dependency {

  private object Version {
    val CirceVersion  = "0.13.0"
    val Http4sVersion = "1.0.0-M20"
    val ScalaJs       = "1.0.0"
  }

  val deps: Seq[ModuleID] = Seq(
    "io.circe"                   %% "circe-generic"             % Version.CirceVersion,
    "org.http4s"                 %% "http4s-blaze-server"       % Version.Http4sVersion,
    "org.http4s"                 %% "http4s-blaze-client"       % Version.Http4sVersion,
    "org.http4s"                 %% "http4s-circe"              % Version.Http4sVersion,
    "org.http4s"                 %% "http4s-dsl"                % Version.Http4sVersion
  )

  val feDeps: Seq[ModuleID] = Seq(
    "org.scala-js" %% "scalajs-java-time"        % Version.ScalaJs
  )

  def apply(): Seq[ModuleID] = deps ++ feDeps
}
