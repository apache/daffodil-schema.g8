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
structure that follows the recommended [DFDL Schema Project Layout] and most recent
best practices from the [DFDL Schema Style Guide]. This
includes git and sbt configuration files, basic DFDL schema files, and [TDML]
and test files.

Once you have generated your schema directory, typing `sbt test` will work and 
run a TDML test. Of course, the initial DFDL schema has no fields, the test data file is empty, and 
the expected XML Infoset file is an empty element. But, it's working and you can
keep it working as you fill in the details of the schema and add tests. 

The schema project is set up to use the `daffodil-sbt` plugin for SBT as part of the
SBT build and test. 
This provides capabilities to compile your DFDL schema into binary form and package it for 
distribution. 
You can read more about `daffodil-sbt` here: [Apache daffodil-sbt Plugin]

### Properties

The following properties are used to configure the generated DFDL schema project:

<dl>
    <dt>name</dt>
    <dd>
        the name of the file format, for example "jpeg" or "png"
    </dd>
    <dt>extension</dt>
    <dd>
        extension used for test files, for example "dat", or "png"
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
[Apache daffodil-sbt Plugin]: https://github.com/apache/daffodil-sbt
[Apache License, v2.0]: https://www.apache.org/licenses/LICENSE-2.0
[DFDL Schema Project Layout]: https://daffodil.apache.org/dfdl-layout/
[DFDL Schema Style Guide]: https://cwiki.apache.org/confluence/display/DAFFODIL/DFDL+Schema+Style+Guide
[Giter8]: http://www.foundweekends.org/giter8/
[SBT]: https://www.scala-sbt.org/
[SBT Giter8]: http://www.foundweekends.org/giter8/testing.html#Using+the+Giter8Plugin
[SBT Scripted]: https://www.scala-sbt.org/1.x/docs/Testing-sbt-plugins.html#step+4%3A+write+a+script
[TDML]: https://daffodil.apache.org/tdml/
