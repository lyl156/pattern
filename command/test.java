package command;

import java.util.logging.Logger;

public class test {
    private final static Logger logger = Logger.getLogger("test");

    public static void main(String[] args) {
        logger.info("this is command pattern");
        // different receiver is available
        Receiver receiver = new Receiver();
        // give specific receiver
        Command commandAdd = new ConcreteCommandBuy(receiver);
        Command commandMinus = new ConcreteCommandMinus(receiver);

        // no need to change
        Invoker invoker = new Invoker();
        invoker.addCommand(commandAdd);
        invoker.addCommand(commandAdd);
        invoker.call();

        invoker.addCommand(commandMinus);
        invoker.call();
    }
}