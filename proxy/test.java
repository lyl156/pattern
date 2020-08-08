package proxy;

import java.util.logging.Logger;

public class test {
    private static Logger logger = Logger.getLogger("test");

    public static void main(String[] args) throws Exception {
        logger.info("this is proxy pattern");
        Subject proxy = new Proxy(new RealSubject());
        proxy.request();
        proxy.request();
        proxy.request();
        // proxy.request();
        // proxy.request();
    }
}