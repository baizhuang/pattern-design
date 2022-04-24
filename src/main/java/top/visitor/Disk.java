package top.visitor;

public class Disk extends HardWare{
    public Disk(String command) {
        super(command);
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visitDisk(this);
    }
}
