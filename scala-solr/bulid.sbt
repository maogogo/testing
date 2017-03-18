name := "scala-solr"

organization := "com.maogogo"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.1" % "test",
  "org.scalactic" %% "scalactic" % "3.0.1",
  "com.github.seratch" %% "scalikesolr" % "4.10.0"
)
