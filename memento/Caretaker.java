package memento;

import java.util.Stack;

public class Caretaker {
    Stack<Memento> stack = new Stack<>();
    private Originator originator;

    public Caretaker(Originator originator) {
        this.originator = originator;
    }

    public void record() {
        Memento memento = this.originator.save();
        stack.push(memento);
    }
    public void undo() {
        Memento memento = stack.pop();
        originator.setState(memento.getState());
    }

}
