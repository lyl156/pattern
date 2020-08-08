package bridge;

public class Square implements Shape {
    private final Color color;

    public Square(Color color) {
        this.color = color;
    }

    @Override
    public void printShape() {
        System.out.println("this is square");
        color.printColor();
    }
}