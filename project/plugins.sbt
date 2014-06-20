// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// SBT Eclipse Plugin
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.5.0")

// Scala Style Plugin
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.3.2")

// SCCT Plugin
addSbtPlugin("com.github.scct" %% "sbt-scct" % "0.2.1")
