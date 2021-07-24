package top.singleton;

/**
 * 第五种，静态内部类单例，线程安全
 */
public class StaticSingleton {

    private StaticSingleton(){}

    private static class SingletonHolder{
        private static final StaticSingleton instance = new StaticSingleton();
    }

    public static StaticSingleton getInstance(){
        return SingletonHolder.instance;
    }

}
