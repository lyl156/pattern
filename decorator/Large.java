package decorator;

public class Large implements Size {
    @Override
    public void printSize() {
        System.out.println("this is large size");
    }
}