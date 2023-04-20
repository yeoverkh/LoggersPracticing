import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExceptionThrownLoggingExample {

    private static Logger logger = LoggerFactory.getLogger(ExceptionThrownLoggingExample.class);

    public static void main(String[] args) throws InterruptedException {
        throwException10Times();
    }

    private static void throwException10Times() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            logThrownException();
            Thread.sleep(1000);
        }
    }

    private static void logThrownException() {
        try {
            throw new Exception();
        } catch (Exception ex) {
            logger.error("an Exception was thrown", ex);
        }
    }
}
