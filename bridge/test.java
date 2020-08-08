package bridge;

import java.util.logging.Logger;

public class test {
    final private static Logger logger = Logger.getLogger("test");

    public static void main(String[] args) {
        logger.info("this is bridge pattern");
        Color blue = new Blue();
        Color green = new Green();
        Shape square = new Square(blue);
        Shape triangle = new Triangle(green);

        square.printShape();
        triangle.printShape();
    }
}