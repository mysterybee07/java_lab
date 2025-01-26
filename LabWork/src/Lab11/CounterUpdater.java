package Lab11;

public class CounterUpdater implements Runnable {
    private final Counter counter;

    public CounterUpdater(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

