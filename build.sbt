lazy val root = (project in file("."))

libraryDependencies ++= Seq(
    "dev.zio" %% "zio" % "2.0.4"
)
