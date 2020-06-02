package Log4jdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logsdemo {
	private static final Logger log= LogManager.getLogger(Logsdemo.class.getName());
	public static void main(String[] arg) {
		log.debug("Debug message loaded");
		log.error("Error message loaded");
		log.fatal("Fatal message loaded");
	}	

}
