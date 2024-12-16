enablePlugins(SbtPlugin)

name := "sbt-codeartifact-core"

libraryDependencies ++= Seq(
  "software.amazon.awssdk" % "sso" % "2.29.34",
  "software.amazon.awssdk" % "codeartifact" % "2.29.34",
  "software.amazon.awssdk" % "ssooidc" % "2.29.34",
  "software.amazon.awssdk" % "sts" % "2.29.34",
  "com.lihaoyi" %% "requests" % "0.9.0",
  "com.lihaoyi" %% "os-lib" % "0.11.3",
  "com.lihaoyi" %% "utest" % "0.8.4" % Test
)

testFrameworks += new TestFramework("utest.runner.Framework")
