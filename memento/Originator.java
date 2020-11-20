package memento;

public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public void changeState(String state) {
        setState(state);
    }

    public Memento save() {
        return new Memento(this.state);
    }

    public void restore(Memento memento) {
        this.state = memento.getState();
    }

    @Override
    public String toString() {
        return "Originator{" +
                "state='" + state + '\'' +
                '}';
    }
}
