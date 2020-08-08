package decorator;

public class Small implements Size {
    @Override
    public void printSize() {
        System.out.println("this is small size");
    }
}