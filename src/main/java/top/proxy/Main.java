package top.proxy;

import top.proxy.parent.House;
import top.proxy.proxy.HouseProxy;

/**
 * @author bz
 * @date 2020/10/6
 */
public class Main {
    public static void main(String[] args) {
        House house = new HouseProxy("未出售","北京三环",25.1);
        house.display();
        house.getPrice();
        house.getStatus();
    }
}
