package command;

public class Receiver {
    // AtomicInt
    int quantity = 10;

    public void addAction() {
        ++quantity;
        System.out.println("addAction " + quantity);
    }

    public void minusAction() {
        --quantity;
        System.out.println("minusAction " + quantity);
    }
}