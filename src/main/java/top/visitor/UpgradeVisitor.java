package top.visitor;

public class UpgradeVisitor implements Visitor{
    @Override
    public void visitCpu(Cup cup) {
        cup.command +="/1+1=2";
    }

    @Override
    public void visitDisk(Disk disk) {
        disk.command +="/记住 1+1 = 2";
    }
}
