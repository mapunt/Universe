package org.universe.world.app;

import org.apache.log4j.Logger;

public class CompApp {

	// http://www.vogella.com/tutorials/Logging/article.html
	/*
	 *  https://www.tutorialspoint.com/log4j/log4j_sample_program.htm
	 *  https://www.tutorialspoint.com/log4j/log4j_configuration.htm
	 */


	//https://alvinalexander.com/blog/post/java/simple-log4j-example
	//https://stackoverflow.com/questions/12532339/no-appenders-could-be-found-for-loggerlog4j
	//http://programming.mvergel.com/2013/01/warn-no-appenders-could-be-found-for.html

	//https://maven.apache.org/general.html

	// Set java version
	// https://maven.apache.org/plugins/maven-compiler-plugin/examples/set-compiler-source-and-target.html

	/* Get actual class name to be printed on */
	static Logger log = Logger.getLogger(CompApp.class.getName());

	public static void main(final String[] args) {
		log.debug("Hello Universe this is a debug message");
		log.info("Hello Universe this is an info message");
	}

}
