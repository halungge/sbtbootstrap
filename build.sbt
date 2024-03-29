name := "simple_sbt_bootstrap"

version := "1.0"

scalaVersion := "2.11.1"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

//resolvers += "spray repo" at "http://repo.spray.io"

//dependencies for AKKA 
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.2"

libraryDependencies += "com.typesafe.akka" %% "akka-slf4j" % "2.3.2"

//Scala test
libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0" % "test"


scalacOptions ++= Seq(
  "-unchecked",
  "-deprecation",
  "-Xlint",
  "-language:_",
  "-target:jvm-1.7",
  "-encoding", "UTF-8"
)