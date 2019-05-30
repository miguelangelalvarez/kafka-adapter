name := "kafka-adapter"
version := "1.0.0-SNAPSHOT"

val Versions = new {
  val ScalaTest = "3.0.4"
  val Mockito = "2.13.0"
  val Logback = "1.2.3"
}

val dependencies: Seq[ModuleID] = List(
  "ch.qos.logback"  %  "logback-classic"  % Versions.Logback
)

val testDependencies: Seq[ModuleID] = List(
  "org.scalatest"   %% "scalatest"        % Versions.ScalaTest,
  "org.mockito"     %  "mockito-core"     % Versions.Mockito
).map(_ % Test)

libraryDependencies ++= dependencies ++ testDependencies

scapegoatVersion in ThisBuild := "1.3.8"

enablePlugins(ScalaArchetypePlugin)