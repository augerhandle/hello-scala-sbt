package net.augerhandle.hello

import org.slf4j.LoggerFactory


class World {
  private val logger = LoggerFactory.getLogger("libraries")

  def value() : String = {
    val s = "World"
    logger.debug(s"emitting value: ${s}")

    s
  }
}
