package com.sc.log
import com.typesafe.scalalogging.slf4j.LazyLogging
class MyClass extends LazyLogging {
	logger.debug("This is very convenient ;-)")
	logger.error("Error in code")
	logger.info("Just information")
}
object MyClass{
  def main(args: Array[String]){
	new MyClass()
  }
}

