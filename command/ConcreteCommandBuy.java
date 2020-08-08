package command;

public class ConcreteCommandBuy implements Command {
    private Receiver receiver = null;

    public ConcreteCommandBuy(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.addAction();
    }
}