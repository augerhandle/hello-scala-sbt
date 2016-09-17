package net.augerhandle.hello

object App {
  def main( args : Array[String] ) {
    var hello : String = (new Hello()).value()
    var world : String = (new World()).value()
    var message : String = hello + " " + world

    println( message )
  }
}
