package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> list = new ArrayList<Observer>();

    public Subject attach(Observer observer) {
        list.add(observer);
        System.out.println("attach a observer");
        return this;
    }

    public void detach(Observer observer) {
        list.remove(observer);
        System.out.println("deatach a observer");
    }

    public void notifyAllObservers(String mess) {
        for (Observer observer : list) {
            observer.update(mess);
        }
    }
}