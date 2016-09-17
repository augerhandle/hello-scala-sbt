# hello-scala-sbt

## What is this?

An simple hello-world program in Scala using SBT as the build tool.

## Contents

* `README.md` : this file
* `src/main/scala/net/augerhandle/hello/App.scala` : the source code for the console app 
* `src/main/scala/net/augerhandle/hello/*.scala` : other Scala classes used by the app

## Building and Running

This is an SBT-based Scala project. I'm assuming that you have SBT installed already on your system.

To build the project, execute this command which will leave a `.jar` file in a `./target/scala-2.xx` directory,
where `xx` is the version of Scala SBT is using (which we don't discuss here). The `.jar` file will contain
and executable console application. The exact name of the 

* `sbt package`

To run the console application, execute the following command.

* `scala ./target/scala-2.xx/yyy.jar`



