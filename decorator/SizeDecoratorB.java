package decorator;

public class SizeDecoratorB extends SizeDecorator {
    public SizeDecoratorB(Size size) {
        this.size = size;
    }

    public void printSize() {
        System.out.println("this is B");
        size.printSize();
    }
}