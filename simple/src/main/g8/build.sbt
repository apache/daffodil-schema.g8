$!
// Licensed to the Apache Software Foundation (ASF) under one or more
// contributor license agreements. See the NOTICE file distributed with
// this work for additional information regarding copyright ownership.
// The ASF licenses this file to You under the Apache License, Version 2.0
// (the "License"); you may not use this file except in compliance with
// the License. You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
!$
name := "dfdl-$name;format="norm"$"

organization := "$package$"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.15"

libraryDependencies ++= Seq(
  "org.apache.daffodil" %% "daffodil-tdml-processor" % "$daffodil_version$" % "test",
  "com.github.sbt" % "junit-interface" % "0.13.3" % "test",
  "junit" % "junit" % "4.13.2" % "test",
  "org.apache.logging.log4j" % "log4j-core" % "2.17.2",
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")

crossPaths := false

// Use flat folder structure. This means *.java and *.scala files are in the
// same directory as resources files, and source/resource files are only
// differentiated by their file extension.
Compile / unmanagedSourceDirectories := Seq(baseDirectory.value / "src")
Compile / unmanagedResourceDirectories := Seq(baseDirectory.value / "src")
Compile / unmanagedSources / includeFilter := "*.java" | "*.scala"
Compile / unmanagedResources / excludeFilter := "*.java" | "*.scala"
Test / unmanagedSourceDirectories := Seq(baseDirectory.value / "test")
Test / unmanagedResourceDirectories := Seq(baseDirectory.value / "test")
Test / unmanagedSources / includeFilter := "*.java" | "*.scala"
Test / unmanagedResources / excludeFilter := "*.java" | "*.scala"
