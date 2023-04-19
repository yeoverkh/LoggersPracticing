import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RollingWithLog4j2Example {

    private static Logger logger = LogManager.getLogger(RollingWithLog4jExample.class);

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 2000; i++) {
            logger.info("This is " + i + " time I say 'Hello, World!'.");
            Thread.sleep(100);
        }
    }
}
