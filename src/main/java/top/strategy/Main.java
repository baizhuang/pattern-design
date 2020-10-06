package top.strategy;

import top.strategy.impl.OperationAdd;
import top.strategy.impl.OperationSub;

/**
 * @author bz
 * @date 2020/10/6
 */
public class Main {
    public static void main(String[] args) {
        Client c1 = new Client(new OperationAdd());
        System.out.println(c1.exec(10,12));
        c1.doDefault();

        Client c2 = new Client(new OperationSub());
        System.out.println(c2.exec(10,12));
        c2.doDefault();
    }
}
