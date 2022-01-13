<!--
Licensed to the Apache Software Foundation (ASF) under one or more
contributor license agreements. See the NOTICE file distributed with
this work for additional information regarding copyright ownership.
The ASF licenses this file to You under the Apache License, Version 2.0
(the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
-->

# Apache Daffodil DFDL Schema Template

This repository is a [Giter8] template for [Apache Daffodil] DFDL schemas.

## Usage

Install [SBT] and run the following command:

```
sbt new apache/daffodil-schema.g8
```

This command prompts for various properties and creates a bare-bones directory
structure that follows the recommended [DFDL Schema Project Layout]. This
includes git and sbt configuration files, a basic DFDL schema file, and [TDML]
and test files.

### Properties

The following properties are used to configure the generated DFDL schema project:

<dl>
    <dt>name</dt>
    <dd>
        the name of the file format, for example "jpeg" or "png"
    </dd>
    <dt>package</dt>
    <dd>
        the package namespace, for example "com.example"
    </dd>
    <dt>namespaced</dt>
    <dd>
        if 'no', uses a flattened directory structure with no package
        directories and mixed source and resource files in src/ and test/
        directories (default)
    </dd>
    <dd>
        if 'yes', uses a deep directory structure with package directories and
        separate directories for source and resource files. This should
        only be used when namespacing is required to avoid file name
        ambiguities.
    </dd>
    <dt>daffodil_version</dt>
    <dd>
        the version of Apache Daffodil to add as a dependency, defaults to the
        latest release on maven central
    </dd>
</dl>

## Testing

This repository uses the [SBT Giter8] plugin to perform a single basic sanity
check of template generation. To execute this check, run:

```
sbt test
```

This command generates a new project using the ``default.properties`` template
values and then runs the [SBT Scripted] commands defined in ``src/test/g8/test``
to validate correct generation.

## License

Apache Daffodil DFDL Schema Template is licensed under the [Apache License, v2.0].


[Apache Daffodil]: https://daffodil.apache.org/
[Apache License, v2.0]: https://www.apache.org/licenses/LICENSE-2.0
[DFDL Schema Project Layout]: https://daffodil.apache.org/dfdl-layout/
[Giter8]: http://www.foundweekends.org/giter8/
[SBT]: https://www.scala-sbt.org/
[SBT Giter8]: http://www.foundweekends.org/giter8/testing.html#Using+the+Giter8Plugin
[SBT Scripted]: https://www.scala-sbt.org/1.x/docs/Testing-sbt-plugins.html#step+4%3A+write+a+script
[TDML]: https://daffodil.apache.org/tdml/
