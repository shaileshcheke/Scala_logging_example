name := "logback-example"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq("com.typesafe.scala-logging" %% "scala-logging-slf4j" % "2.1.2",
"com.typesafe" %% "scalalogging-slf4j" % "1.0.1",
"org.slf4j" % "slf4j-api" % "1.7.1",
"ch.qos.logback" % "logback-classic" % "1.0.3"
)
