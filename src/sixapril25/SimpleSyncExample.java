class Counter {
    int count = 0;

    public synchronized void increment() {
        count++;
    }
}

public class SimpleSyncExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Thread 1
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                counter.increment();
            }
        });

        // Thread 2
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();  // wait for t1 to finish
        t2.join();  // wait for t2 to finish

        System.out.println("Final count: " + counter.count);
    }
}
