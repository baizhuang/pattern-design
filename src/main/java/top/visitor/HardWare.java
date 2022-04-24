package top.visitor;

public abstract class HardWare {

    String command;

    public HardWare(String command) {
        this.command = command;
    }

    public void run(){
        System.out.println(command);
    }

    abstract void accept(Visitor visitor);
}
