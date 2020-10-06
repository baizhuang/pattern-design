package top.strategy.impl;

import top.strategy.parent.Strategy;

/**
 * @author bz
 * @date 2020/10/6
 */
public class OperationSub implements Strategy {
    @Override
    public int calculate(int a, int b) {
        return a>b?a-b:b-a;
    }
}
