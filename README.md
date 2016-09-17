# hello-scala-sbt

## What is this?

An simple hello-world program in Scala using SBT as the build tool.

It illustrates the following things:
* ultra simple console app that calls out to some classes in the project
* how to use `slf4j` logging (based on `logback`)

## Contents

* `README.md` : this file
* `src/main/scala/net/augerhandle/hello/App.scala` : the source code for the console app 
* `src/main/scala/net/augerhandle/hello/*.scala` : other Scala classes used by the app
* `build.sbt` : the SBT build file used to build and run this project
* `src/main/resources/logback.xml` : the logging config file 

## Building and Running

This is an SBT-based Scala project. I'm assuming that you have SBT installed already on your system.

To build the project, execute this command which will leave a `.jar` file in a `./target/scala-2.xx` directory,
where `xx` is the version of Scala SBT is using (which we don't discuss here). The `.jar` file will contain
and executable console application. The exact name of the 

* `sbt package`

To run the console application, execute the following command.

* `sbt run`

(If you don't use sbt to run the app -- eg, try to use `java -jar` or `scala` to run it -- you'll have trouble.
Explaining that isn't in the scope of this simple example.)

As a result of running the application, you should see the _usual_ hello world greeting in the console output,
and you should also see a log file in the top-level directory, as specified in `src/main/resources/logback.xml`.



