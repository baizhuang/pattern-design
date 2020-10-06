package top.strategy.impl;

import top.strategy.parent.Strategy;

/**
 * @author bz
 * @date 2020/9/27
 */
public class OperationAdd implements Strategy {
    @Override
    public void doDefault() {
        System.out.println("add 重写doDefault");
    }

    @Override
    public int calculate(int a, int b) {
        return  a + b;
    }
}
