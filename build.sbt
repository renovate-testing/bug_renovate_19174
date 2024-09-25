lazy val root = (project in file("."))

libraryDependencies ++= Seq(
    "dev.zio" %% "zio" % "2.1.9"
)

val slf4jVersion = "2.0.4"

dependencyOverrides ++= Seq(
  // Enforce SLF4J consistency
  "org.slf4j" % "slf4j-api" % slf4jVersion,
  "org.slf4j" % "jcl-over-slf4j" % slf4jVersion,
  "org.slf4j" % "jul-to-slf4j" % slf4jVersion,
)
