name := "HelloWorld"

version := "1.0"

scalaVersion := "2.11.8"


mainClass in assembly := Some("MainApp")
assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = false, includeDependency = false)