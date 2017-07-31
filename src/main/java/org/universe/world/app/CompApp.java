package org.universe.world.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// TODO: Auto-generated Javadoc
//import org.apache.log4j.Logger;

/**
 * The Class CompApp.
 */
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
	//static Logger log = Logger.getLogger(CompApp.class.getName());

	/** The logger. */
	private static Logger logger = LoggerFactory.getLogger(CompApp.class);

	/**
	 * Read config.
	 */
	private static void readConfig() {
		File configFile = new File("config.properties");

		try {
			FileReader reader = new FileReader(configFile);
			Properties props = new Properties();
			props.load(reader);

			String host = props.getProperty("host");
			System.out.println("Host name is: " + host);

			String port = props.getProperty("port");
			System.out.println("Port number is: " + port);

			reader.close();
		} catch (FileNotFoundException ex) {
			// file does not exist
		} catch (IOException ex) {
			// I/O error
		}
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(final String[] args) {

		readConfig();

		//log.debug("Hello Universe this is a debug message");
		//log.info("Hello Universe this is an info message");

		logger.info("Hello Universe this is an info message");
		logger.debug("Hello Universe this is an debug message");
		logger.error("Hello Universe this is an error message");
		
	}

}
