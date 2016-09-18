package net.augerhandle.hello

import org.slf4j.LoggerFactory
import com.typesafe.config._
import scala.collection.JavaConversions._

object App {
  private val logger = LoggerFactory.getLogger(this.getClass())

  def main( args : Array[String] ) {
    logger.info("begin..." )

    val appRunnable = new AppRunnable("app.wordsToConvert")
    appRunnable.run()

    logger.info("...end")
  }
}
