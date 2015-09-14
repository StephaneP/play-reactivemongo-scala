name := "PlayReactiveMongo"

version := "1.0"

lazy val `playreactivemongo` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq( jdbc , anorm , cache , ws ,
  "org.reactivemongo" %% "play2-reactivemongo" % "0.11.2.play24")

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  