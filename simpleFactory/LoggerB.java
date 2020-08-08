package simpleFactory;

public class LoggerB implements MyLogger {
    @Override
    public void getName() {
        System.out.println("this is logger B");
    }
}