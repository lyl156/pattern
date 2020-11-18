package composite;

public class Leaf implements Component {
    private final String name;

    public Leaf(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void execute() {
        System.out.println("Component name is " + this.getName());
    }
}
