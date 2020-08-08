package command;

public class ConcreteCommandMinus implements Command {
    private Receiver receiver = null;

    public ConcreteCommandMinus(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.minusAction();
    }
}