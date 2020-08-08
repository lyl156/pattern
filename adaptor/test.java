package adaptor;

import java.util.logging.Logger;

public class test {
    private static Logger logger = Logger.getLogger("test");

    public static void main(String[] args) {
        // System.out.println("aaa");
        logger.info("adaptor pattern");
        Target target = new Adaptor(new Adaptee());
        target.getSentence();
        target.getNumber();
    }
}