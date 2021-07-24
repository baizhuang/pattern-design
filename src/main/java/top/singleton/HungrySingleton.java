package top.singleton;

/**
 * 第二种，饿汉单例，线程安全
 */
public class HungrySingleton {

    private HungrySingleton(){

    }

    private static final HungrySingleton singleton = new HungrySingleton();

    public static HungrySingleton getInstance(){
        return singleton;
    }
}
