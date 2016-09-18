package net.augerhandle.hello

import org.slf4j.LoggerFactory
import com.typesafe.config._
import scala.collection.JavaConversions._

class AppRunnable( configKey : String ) {
  private val logger = LoggerFactory.getLogger(this.getClass())

  def run() : Unit = {
    logger.debug(s"loading words to convert from config key ${configKey}")

    val config = ConfigFactory.load()
    val wordsToConvert = config.getStringList( configKey )
    logger.debug( s"words to convert: [${wordsToConvert.mkString(", ")}]" )

    val convertedWords : Seq[String] = wordsToConvert.map( w => w.toUpperCase() )
    logger.debug( s"converted words: [${convertedWords.mkString(", ")}]" )

    val message = convertedWords.mkString(", ") + "!"
    println( message )
  }
}
