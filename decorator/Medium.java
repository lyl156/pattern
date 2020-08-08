package decorator;

public class Medium implements Size {
    @Override
    public void printSize() {
        System.out.println("this is medium size");
    }
}