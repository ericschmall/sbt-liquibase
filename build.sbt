
sbtPlugin := true

organization := "com.github.bigtoast"

name := "sbt-liquibase"

version := "0.0-1"

scalaVersion := "2.10.4"

libraryDependencies += "org.liquibase" % "liquibase-core" % "3.3.1"

publishTo := Some(Resolver.file("ericschmall.github.com", file(Path.userHome + "/Projects/EricSchmall/ericschmall.github.com/repo")))