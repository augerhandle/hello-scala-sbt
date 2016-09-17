package net.augerhandle.hello

import org.slf4j.LoggerFactory

object App {
  private val logger = LoggerFactory.getLogger(this.getClass)

  def main( args : Array[String] ) {
    logger.info("running app..." )
    run()
    logger.info("...terminating app")
  }

  private def run() : Unit = {
    var hello : String = (new Hello()).value()
    var world : String = (new World()).value()
    var message : String = hello + " " + world

    println( message )
  }
}
