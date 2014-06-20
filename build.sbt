name := """esql"""

version := "1.0-SNAPSHOT"

scalaVersion := "2.10.4"

org.scalastyle.sbt.ScalastylePlugin.Settings

ScctPlugin.instrumentSettings

libraryDependencies ++= Seq(
	"org.elasticsearch" 		%	 "elasticsearch"		 % "1.2.1",
	"org.scalatest" 			%%	 "scalatest"			 % "2.2.0"	
)
