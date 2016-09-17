package net.augerhandle.hello

import org.slf4j.LoggerFactory

object App {
  private val logger = LoggerFactory.getLogger("application")

  def main( args : Array[String] ) {
    logger.info("running app..." )
    run()
    logger.info("...terminating app")
  }

  private def run() : Unit = {
    var word_1 : String = (new WordGenerator("Hello")).generate()
    var word_2 : String = (new WordGenerator("world")).generate()
    var message : String = s"${word_1}, ${word_2}!"

    println( message )
  }
}
