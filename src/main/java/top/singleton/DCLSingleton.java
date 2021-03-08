package top.singleton;

/**
 *
 * 关于 volatile
 * dcl 模式不加 volatile 可能会得到一个未初始化的对象
 * 对象的创建：
 * 1.在堆上创建对象
 * 2.初始化对象
 * 3.将符号引用指向该对象
 *
 * 正常顺序是正常的，但是编译器会进行指令重排序优化
 * 1.创建对象
 * 2.将符号引用指向该对象
 * 3.对对象初始化
 *
 * 而如果发生指令重排序，则会导致返回的单例对象是错误
 *
 *
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
