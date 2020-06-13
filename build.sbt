name := """logs.embits.org"""
organization := "org.embits"
maintainer := "technical@elektroninemuzika.lt"

version := "0.0.1-skeleton"


lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.2"

libraryDependencies += guice
libraryDependencies += "io.sentry" % "sentry-logback" % "1.7.16"