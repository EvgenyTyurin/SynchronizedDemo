/**
 * Generates sequence 1,2,3...
 */

public class SequenceGenerator {
    private int num;
    // Thread safe synchronized getNext()
    public synchronized int getNext(){
        return ++num;
    }
}
