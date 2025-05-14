package sixapril25;

 class CreatingThreads  extends Thread implements Runnable {
    @Override
    public void run() {
        System.out.println("In multithreading");
    }
}

public class Tet {
    public static void main(String[] args) {
        Thread numberThread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        });

        Thread t2 = new Thread(()->{
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        });

        numberThread.start();
        t2.start();
    }
}
