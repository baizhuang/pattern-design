package top.strategy.parent;


/**
 * @author bz
 * @date 2020/9/27
 */
public interface Strategy {

    default void doDefault(){
        System.out.println("接口抽象方法");
    }

    /**
     * 抽象计算
     * @param a
     * @param b
     */
    int calculate(int a ,int b);
}
