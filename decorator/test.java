package decorator;

public class test {
    public static void main(String[] args) {
        System.out.println("aa");
        Size small = new Small();
        Size medium = new Medium();

        Size sizeDecoratorA = new SizeDecoratorA(small);
        Size sizeDecoratorB = new SizeDecoratorB(medium);

        sizeDecoratorA.printSize();
        sizeDecoratorB.printSize();
    }
}