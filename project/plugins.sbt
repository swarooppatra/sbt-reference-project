scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature")

resolvers += Resolver.typesafeIvyRepo("releases")

libraryDependencies += "org.scala-sbt" % "scripted-plugin" % sbtVersion.value

addSbtPlugin("com.github.gseitz" % "sbt-release" % "0.8.3")
