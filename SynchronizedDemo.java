/**
 * Create and test thread safe int sequence generator using synchronized
 */

public class SynchronizedDemo {

    public static void main(String[] args) {
        // init thread safe generator
        SequenceGenerator generator = new SequenceGenerator();
        // init generator consumers
        MyThread thread1 = new MyThread("th1", generator);
        MyThread thread2 = new MyThread("th2", generator);
        MyThread thread3 = new MyThread("th3", generator);
        // Start a race for ints from generator
        thread1.start();
        thread2.start();
        thread3.start();
        // At last the generated number must be stable
        // 3 * MyThread.SEQ_SIZE = 30000
    }

}
