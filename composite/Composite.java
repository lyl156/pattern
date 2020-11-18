package composite;


import java.util.HashSet;
import java.util.Set;

public class Composite implements Component {
    private final String name;
    private final Set<Component> components = new HashSet<>();

    public Composite(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void add(Component component) {
        if (components.contains(component)) {
            System.out.println("this component has already add in this Composite");
            return;
        }
        components.add(component);
    }

    @Override
    public void execute() {
        for (Component c : components) {
            c.execute();
        }
    }
}
