name := "Simple_Scala_Server"

version := "0.1"

scalaVersion := "2.11.0"

// https://mvnrepository.com/artifact/io.circe/circe-parser
val circeVersion = "0.11.1"
libraryDependencies ++= Seq(
  "io.circe"  %% "circe-core"     % circeVersion,
  "io.circe"  %% "circe-generic"  % circeVersion,
  "io.circe"  %% "circe-parser"   % circeVersion
)
//libraryDependencies += "io.circe" %% "circe-parser" % "0.11.1"