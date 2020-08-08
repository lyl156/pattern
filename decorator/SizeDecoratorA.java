package decorator;

public class SizeDecoratorA extends SizeDecorator {
    public SizeDecoratorA(Size size) {
        this.size = size;
    }

    @Override
    public void printSize() {
        System.out.println("this is decorator A");
        size.printSize();
    }
}