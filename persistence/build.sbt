name := "persistence"

version := "0.1"

scalaVersion := "2.13.5"


libraryDependencies += "com.typesafe.slick" %% "slick" % "3.3.3"
libraryDependencies += "mysql" % "mysql-connector-java" % "8.0.24"
libraryDependencies += "com.h2database" % "h2" % "1.4.200" % Test
libraryDependencies += "org.mockito" %% "mockito-scala" % "1.16.37" % Test

lazy val http = project.in(file("http"))

  .settings {

    libraryDependencies += "com.typesafe.akka" %% "akka-http" % "10.2.4"
    libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.6.14"
    libraryDependencies +="com.typesafe.akka" %% "akka-stream" % "2.6.14"
    libraryDependencies +="com.typesafe.akka" %% "akka-actor-testkit-typed" % "2.5.23" % Test
    libraryDependencies +="com.typesafe.akka" %% "akka-stream-testkit" % "2.6.14" % Test
      libraryDependencies +="com.typesafe.akka" %% "akka-http-testkit" % "10.2.4" % Test


  }



lazy val root = project.in(file(".")).aggregate(http)



