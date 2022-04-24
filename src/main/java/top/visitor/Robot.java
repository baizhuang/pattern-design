package top.visitor;

public class Robot {

    private Cup cpu;
    private Disk disk;

    public Robot() {
        this.cpu = new Cup("1+1=1");
        this.disk = new Disk("记住 1+1=1");
    }

    public void cal(){
        cpu.run();
        disk.run();
    }

    public void accept(Visitor visitor){
        cpu.accept(visitor);
        disk.accept(visitor);
    }

}
