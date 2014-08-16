import twirl.sbt.TwirlPlugin.Twirl

scalaVersion := "2.10.4"

scalacOptions := Seq("-deprecation", "-encoding", "utf8")

seq(Twirl.settings: _*)