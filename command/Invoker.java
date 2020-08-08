package command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<Command> list = new ArrayList<>();

    public void addCommand(Command command) {
        list.add(command);
    }

    public void call() {
        for (Command command : list) {
            command.execute();
        }
        list.clear();
    }
}