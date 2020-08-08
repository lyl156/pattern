package facade;

import java.util.logging.Logger;

public class test {
    private final static Logger logger = Logger.getLogger("test");

    public static void main(String[] args) {
        logger.info("this is facade pattern");
        Facade facade = new Facade();

        facade.startInMorning();
        // facade.startInNoon();
        // facade.startAtNight();
    }
}