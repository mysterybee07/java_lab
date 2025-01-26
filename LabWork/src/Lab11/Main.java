package Lab11;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(); // Shared counter object

        // Create threads
        Thread thread1 = new Thread(new CounterUpdater(counter));
        Thread thread2 = new Thread(new CounterUpdater(counter));
        Thread thread3 = new Thread(new CounterUpdater(counter));

        // Start threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Display the final value of the counter
        System.out.println("Final Counter Value: " + counter.getValue());
    }
}

