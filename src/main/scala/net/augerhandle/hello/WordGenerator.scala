package net.augerhandle.hello

import org.slf4j.LoggerFactory


class WordGenerator ( val wordToGenerate : String ) {
  private val logger = LoggerFactory.getLogger("libraries")

  def generate() : String = {
    logger.debug(s"emitting value: ${this.wordToGenerate}")
    this.wordToGenerate
  }
}
