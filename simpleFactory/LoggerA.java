package simpleFactory;

public class LoggerA implements MyLogger {
    @Override
    public void getName() {
        System.out.println("this is logger A");
    }
}