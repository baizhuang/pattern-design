package top.singleton;

/**
 * 第三种，懒汉线程安全
 */
public class LazySafeSingleton {
    private LazySafeSingleton(){}

    private static LazySafeSingleton instance;

    public static synchronized LazySafeSingleton getInstance(){
        if(instance == null){
            instance = new LazySafeSingleton();
        }
        return instance;
    }

}
