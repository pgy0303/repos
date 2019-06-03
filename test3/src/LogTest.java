import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LogTest {
	private static final Logger logger 
	= Logger.getLogger(LogTest.class.getName());
	
	public static void main(String[] args) {
		logger.info("log4j Å×½ºÆ®");
	}
	
	public static void saveLogFile(Logger logger) {
		FileHandler fh;
		try {
			fh = new FileHandler("c:/home/logTest.log");
			logger.addHandler(fh);
			
			SimpleFormatter formatter = new SimpleFormatter();
			fh.setFormatter(formatter);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
