// https://www.scala-sbt.org/1.0/docs/Basic-Def.html

lazy val root = (project in file("."))

  .settings(
    name := "scala-basic-sbt-project",
    scalaVersion := "2.12.6",
    version := "0.1.0-SNAPSHOT",
    
      libraryDependencies += "org.scalanlp" %% "breeze" % "0.13.2",
      libraryDependencies += "org.scalanlp" %% "breeze-natives" % "0.13.2",

    resolvers += "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/" 
  )
