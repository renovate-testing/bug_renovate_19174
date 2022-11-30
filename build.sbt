lazy val root = (project in file("."))

val slf4jVersion = "2.0.4"

libraryDependencies ++= Seq(
    "org.slf4j" % "slf4j-api" % slf4jVersion,
    "dev.zio" %% "zio" % "2.0.4"
)
