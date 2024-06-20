package com.courses.capacitacionesflypass.sesion2.i.concurrenceparallelism.locksSincronization;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Runnable task = () -> {
            try {
                TimeUnit.SECONDS.sleep((long) (Math.random() * 5));
                System.out.println("Completed: " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                latch.countDown();
            }
        };

        executor.submit(task);
        executor.submit(task);
        executor.submit(task);

        latch.await(); // Esperar hasta que el contador llegue a 0
        System.out.println("All tasks completed.");
        executor.shutdown();
    }
}
