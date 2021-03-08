package top.singleton;

public class TestSimple {
    public static void main(String[] args) {

        Thread[] threads = new Thread[1000];

        for(int i=0;i<threads.length;i++){
            threads[i] = new Thread(()->{
                SimpleSingleton singleton = SimpleSingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + ":" +singleton.hashCode());
            },"thread"+i);
            threads[i].start();
        }

    }
}
