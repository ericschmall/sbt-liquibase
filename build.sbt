
sbtPlugin := true

organization := "com.github.bigtoast"

name := "sbt-liquibase"

version := "0.0-1"

scalaVersion := "2.10.4"

libraryDependencies += "org.liquibase" % "liquibase-core" % "3.3.1"

//publishTo := Some(Resolver.file("bigtoast.github.com", file(Path.userHome + "/Projects/BigToast/bigtoast.github.com/repo")))