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
val root = (project in file("."))
  .settings(
    name := "dfdl-$name;format="norm"$",
    organization := "$package$",
    version := "0.1.0-SNAPSHOT",

    // For details about settings specific to daffodilProject() see
    //
    //   https://github.com/apache/daffodil-sbt
    //
    // Some commonly used options are commented out below

    $if(!namespaced.truthy)$daffodilFlatLayout := true,$endif$

    // use a specific version of Daffodil instead of the plugin provided default
    // daffodilVersion := "0.0.0",

    // define the schema root for building saved parsers with packageDaffodilBin
    // daffodilPackageBinInfos := Seq(
    //   DaffodilBinInfo("/$if(namespaced.truthy)$$package;format="packaged"$/$name;format="camel"$/xsd/$endif$$name;format="camel"$Root.dfdl.xsd")
    // ),

    // make saved parsers created with packageDaffodilBin available to TDML tests
    // daffodilTdmlUsesPackageBin := true,
  )
  .daffodilProject()

