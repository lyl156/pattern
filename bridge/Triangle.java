package bridge;

public class Triangle implements Shape {
    private final Color color;

    public Triangle(Color color) {
        this.color = color;
    }

    @Override
    public void printShape() {
        System.out.println("this is triangle");
        color.printColor();
    }
}