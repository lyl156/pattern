package observer;

import java.util.logging.Logger;

public class test {
    private final static Logger logger = Logger.getLogger("test");

    public static void main(String[] args) {
        logger.info("this is observer pattern");
        ConcreteSubject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver();
        Observer observer2 = new ConcreteObserver();
        Observer observer3 = new ConcreteObserver();
        subject.attach(observer1).attach(observer2).attach(observer3);

        subject.setState("hello");
    }
}