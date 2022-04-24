package top.visitor;

public class Cup extends HardWare {
    public Cup(String command) {
        super(command);
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visitCpu(this);
    }

}
