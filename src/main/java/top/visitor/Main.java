package top.visitor;


/**
 * 访问者设计模式
 */
public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot();
        robot.cal();
        Visitor visitor = new UpgradeVisitor();
        robot.accept(visitor);
        robot.cal();
    }
}
