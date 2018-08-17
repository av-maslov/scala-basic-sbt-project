// https://www.scala-sbt.org/1.0/docs/Basic-Def.html

lazy val root = (project in file("."))

  .settings(
    name := "scala-basic-sbt-project",
    scalaVersion := "2.12.6",
    version := "0.1.0-SNAPSHOT",
    
      libraryDependencies += "org.scalanlp" %% "breeze" % "0.12",
      libraryDependencies += "org.scalanlp" %% "breeze-natives" % "0.12"
     
  )
