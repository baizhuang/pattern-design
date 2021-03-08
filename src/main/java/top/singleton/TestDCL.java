package top.singleton;

public class TestDCL {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();

        for(int i=0;i<10000;i++){
            new Thread(myThread).start();
        }

    }

    static class MyThread implements Runnable{
        @Override
        public void run() {
            DCLSingleton singleton = DCLSingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + ":" +singleton.hashCode());
        }
    }
}
