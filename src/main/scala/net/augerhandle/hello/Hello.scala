package net.augerhandle.hello

import org.slf4j.LoggerFactory


class Hello {
  private val logger = LoggerFactory.getLogger("libraries")

  def value() : String = {
    val s = "Hello"
    logger.debug(s"emitting value: ${s}")

    s
  }
}
