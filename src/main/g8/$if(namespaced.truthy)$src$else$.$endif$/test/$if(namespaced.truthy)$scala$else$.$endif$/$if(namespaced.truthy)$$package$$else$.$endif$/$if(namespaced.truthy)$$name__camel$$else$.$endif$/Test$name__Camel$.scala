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
package $package$.$name;format="camel"$

import org.junit.AfterClass
import org.junit.Test

import org.apache.daffodil.tdml.Runner

object Test$name;format="Camel"$ {
  lazy val runner = Runner("/$if(namespaced.truthy)$$package;format="packaged"$/$name;format="camel"$/$endif$", "Test$name;format="Camel"$.tdml")

  @AfterClass def shutDown {
    runner.reset
  }
}

class Test$name;format="Camel"$ {

  import Test$name;format="Camel"$._

  @Test def test_$name;format="camel"$_01(): Unit = { runner.runOneTest("test_$name;format="camel"$_01") }
}
