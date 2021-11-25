package Task4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HighLevel {
    public static void main(String[] args) {
        final ExecutorService executor = Executors.newFixedThreadPool(4);
        executor.submit(() -> Calculations.increment(13,7));
        executor.submit(() -> Calculations.decrement(21,44));
        executor.submit(() -> Calculations.multi(3,7));
        executor.submit(() -> Calculations.division(25,4));

        executor.shutdown();
    }
}
