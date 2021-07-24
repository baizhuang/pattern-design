package top.singleton;

/**
 * 第四种，双检查锁，线程安全
 */

public class DCLSingleton {

    private DCLSingleton(){}

    private static volatile DCLSingleton singleton = null;

    public static DCLSingleton getInstance(){
        if(singleton == null){
            synchronized (DCLSingleton.class){
                if(singleton == null){
                    singleton = new DCLSingleton();
                }
            }
        }
        return singleton;
    }

}
