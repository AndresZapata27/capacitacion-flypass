package com.courses.capacitacionesflypass.sesion2.i.concurrenceparallelism.locksSincronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample {

    private static final ReadWriteLock lock = new ReentrantReadWriteLock();
    private static String sharedData = "Initial Data";

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Runnable readTask = () -> {
            lock.readLock().lock();
            try {
                System.out.println(Thread.currentThread().getName() + " reading data: " + sharedData);
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                lock.readLock().unlock();
            }
        };

        Runnable writeTask = () -> {
            lock.writeLock().lock();
            try {
                System.out.println(Thread.currentThread().getName() + " writing data.");
                sharedData = "Updated Data by " + Thread.currentThread().getName();
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                lock.writeLock().unlock();
            }
        };

        // Start reader threads
        executor.submit(readTask);
        executor.submit(readTask);

        // Start writer thread
        executor.submit(writeTask);

        executor.shutdown();
        try {
            if (!executor.awaitTermination(10, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }
}
