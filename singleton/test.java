package singleton;

public class test {
    public static void main(String[] args) {
        System.out.println("ss");
        final MySingleton mySingleton = MySingleton.getInstance();
        mySingleton.getSentence();
    }

}