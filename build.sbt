name := "faas"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,"mysql" % "mysql-connector-java" % "5.1.18"
)

resolvers += (
    "Local Maven Repository" at "file:///"+Path.userHome.absolutePath+"/.m2/repository"
)


play.Project.playJavaSettings
