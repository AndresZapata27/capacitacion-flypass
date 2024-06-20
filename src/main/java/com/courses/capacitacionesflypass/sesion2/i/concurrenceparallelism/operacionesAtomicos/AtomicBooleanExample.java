package com.courses.capacitacionesflypass.sesion2.i.concurrenceparallelism.operacionesAtomicos;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBooleanExample {

    private static final AtomicBoolean flag = new AtomicBoolean(false);

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable task1 = () -> {
            try {
                TimeUnit.SECONDS.sleep(1);
                flag.set(true);
                System.out.println("Task 1 set flag to true");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        Runnable task2 = () -> {
            while (!flag.get()) {
                // Esperar a que el flag sea true
            }
            System.out.println("Task 2 detected flag is true");
        };

        executor.submit(task1);
        executor.submit(task2);

        executor.shutdown();
        try {
            if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }
}
