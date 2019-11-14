/**
 * Sequence generator consumer
 */

public class MyThread extends Thread {

    private final int SEQ_SIZE = 10000;
    private final SequenceGenerator generator;
    private final String name;
    private int last = -1;

    public MyThread(String name, SequenceGenerator generator) {
        this.generator = generator;
        this.name = name;
    }

    @Override
    public void run() {
        // get some ints
        for (int i = 0; i < SEQ_SIZE; i++)
            last = generator.getNext();
        // Show last
        System.out.println(name + ": " + last);
    }

}
