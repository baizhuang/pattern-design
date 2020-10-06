package top.proxy.proxy;

import top.proxy.child.RealHouse;
import top.proxy.parent.House;

/**
 * @author bz
 * @date 2020/10/6
 */
public class HouseProxy implements House {

    private RealHouse realHouse;

    public HouseProxy(String status,String address,Double price) {
        this.realHouse = new RealHouse(status,address,price);
    }

    @Override
    public void getStatus() {
        realHouse.getStatus();
    }

    @Override
    public void getPrice() {
        realHouse.getPrice();
    }

    @Override
    public void display() {
        realHouse.display();
    }
}
