package car_assembly;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
    public static void main(String[] args) {

        ExecutorService assembly = Executors.newFixedThreadPool(3);

        for (int tires = 1; tires <= 4; tires++) {
            assembly.submit(new Tyre());
        }

        for (int seats = 1; seats <= 5; seats++) {
            assembly.submit(new Seat());
        }

        assembly.submit(new Engine());
        assembly.submit(new Frame());

        assembly.shutdown();
    }
}
