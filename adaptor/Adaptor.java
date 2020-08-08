package adaptor;

// for specific D.B.
public class Adaptor implements Target {
    private Adaptee adaptee = null;

    public Adaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void getSentence() {
        adaptee.printSentence();
    }

    public void getNumber() {
        adaptee.printNumber();
    }
}