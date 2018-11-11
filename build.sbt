// https://www.scala-sbt.org/1.0/docs/Basic-Def.html
// https://github.com/scalanlp/breeze/

lazy val root = (project in file("."))

  .settings(
    name := "scala-basic-sbt-project",
    scalaVersion := "2.12.6",
    version := "0.1.0-SNAPSHOT",
    
    libraryDependencies ++= Seq(
      "org.scalanlp" %% "breeze" % "0.13.2",
      "org.scalanlp" %% "breeze-natives" % "0.13.2",
      "org.scalanlp" %% "breeze-viz" % "0.13.2"
    ),

    // Or, add dependensies like that:
    // libraryDependencies += "org.scalanlp" %% "breeze" % "0.13.2",
    // libraryDependencies += "org.scalanlp" %% "breeze-natives" % "0.13.2",
    // libraryDependencies += "org.scalanlp" %% "breeze-viz" % "0.13.2",

    resolvers += "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/" 
  )
