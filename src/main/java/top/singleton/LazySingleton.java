package top.singleton;

/**
 *  第一种 ，懒汉线程不安全单例
 */
public class LazySingleton {
    private LazySingleton(){

    }

    private static LazySingleton instance;


    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

}
