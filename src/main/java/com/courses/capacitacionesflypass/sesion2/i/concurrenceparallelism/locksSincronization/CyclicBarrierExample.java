package com.courses.capacitacionesflypass.sesion2.i.concurrenceparallelism.locksSincronization;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CyclicBarrierExample {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3, () -> System.out.println("Barrier reached!"));
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Runnable task = () -> {
            try {
                TimeUnit.SECONDS.sleep((long) (Math.random() * 5));
                System.out.println("Waiting at barrier: " + Thread.currentThread().getName());
                barrier.await();
                System.out.println("Crossed the barrier: " + Thread.currentThread().getName());
            } catch (InterruptedException | BrokenBarrierException e) {
                Thread.currentThread().interrupt();
            }
        };

        executor.submit(task);
        executor.submit(task);
        executor.submit(task);

        executor.shutdown();
    }
}
