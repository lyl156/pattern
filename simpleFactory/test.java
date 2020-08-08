package simpleFactory;

import java.util.logging.Logger;

public class test {
    private static Logger logger = Logger.getLogger("test");

    public static void main(String[] args) throws Exception {
        logger.info("this is simple factory pattern");
        MyLogger mylogger = Factory.getLogger(LoggerPath.loggerA);
        mylogger.getName();
    }
}