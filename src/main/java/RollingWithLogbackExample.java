import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RollingWithLogbackExample {

    private static Logger logger = LoggerFactory.getLogger(RollingWithLogbackExample.class);

    public static void main(String[] args) throws InterruptedException {
        for(int i = 0; i < 1000; i++) {
            logger.info("This is the " + i + " time I say 'Hello World'.");
            Thread.sleep(100);
        }
    }
}
