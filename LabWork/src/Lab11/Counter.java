package Lab11;

public class Counter {
    private int count = 0;

    // Synchronized method to ensure thread-safe increment
    public synchronized void increment() {
        count++;
    }

    // Synchronized method to get the current value of the counter
    public synchronized int getValue() {
        return count;
    }
}
