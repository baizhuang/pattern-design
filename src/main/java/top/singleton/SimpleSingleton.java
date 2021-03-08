package top.singleton;

/**
 * 静态单例
 */


public class SimpleSingleton {

    private SimpleSingleton(){}

    private static final SimpleSingleton singleton = new SimpleSingleton();

    public static SimpleSingleton getInstance(){
        return singleton;
    }
}
