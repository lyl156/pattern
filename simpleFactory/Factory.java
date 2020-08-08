package simpleFactory;

public class Factory {
    public static MyLogger getLogger(String loggerPath) throws Exception {
        Class<?> clz = Class.forName(loggerPath);
        return (MyLogger) clz.getDeclaredConstructor().newInstance();
    }
}