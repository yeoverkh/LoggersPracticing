import org.apache.log4j.Logger;

public class RollingWithLog4jExample {

    private static Logger logger = Logger.getLogger(RollingWithLog4jExample.class);

    public static void main(String[] args) throws InterruptedException {
        for(int i = 0; i < 2000; i++) {
            logger.info("This is the " + i + " time I say 'Hello World'.");
            Thread.sleep(100);
        }
    }
}
