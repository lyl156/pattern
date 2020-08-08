package singleton;

public class MySingleton {
    private volatile static MySingleton instance = null;

    private MySingleton() {

    }

    static public MySingleton getInstance() {
        if (instance == null) {
            synchronized (MySingleton.class) {
                if (instance == null) {
                    instance = new MySingleton();
                }
            }
        }
        return instance;
    }

    void getSentence() {
        System.out.println("successful creat MySingleton");
    }
}