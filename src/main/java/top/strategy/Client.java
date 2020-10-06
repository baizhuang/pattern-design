package top.strategy;

import top.strategy.parent.Strategy;

/**
 * @author bz
 * @date 2020/10/6
 */
public class Client {
    private Strategy strategy;

    public Client(Strategy strategy) {
        this.strategy = strategy;
    }

    public int exec(int a,int b){
        return strategy.calculate(a,b);
    }

    public void doDefault(){
        strategy.doDefault();
    }
}
