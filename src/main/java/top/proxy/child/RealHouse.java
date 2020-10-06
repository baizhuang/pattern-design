package top.proxy.child;

import top.proxy.parent.House;

/**
 * @author bz
 * @date 2020/10/6
 */
public class RealHouse implements House {
    private String status;
    private String address;
    private Double price;

    public RealHouse(String status, String address, Double price) {
        this.status = status;
        this.address = address;
        this.price = price;
    }

    @Override
    public void getStatus() {
        System.out.println(status);
    }

    @Override
    public void getPrice() {
        System.out.println(price);
    }

    @Override
    public void display() {
        System.out.println(status+","+address+","+price);
    }
}
