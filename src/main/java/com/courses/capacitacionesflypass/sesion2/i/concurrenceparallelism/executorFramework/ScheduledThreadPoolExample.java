package com.courses.capacitacionesflypass.sesion2.i.concurrenceparallelism.executorFramework;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExample {

    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        // Tarea que se ejecutará después de un retraso de 10 minutos
        Runnable delayedTask = () -> {
            System.out.println("Delayed task executed at: " + System.currentTimeMillis());
        };

        // Programar la tarea para que se ejecute una vez después de 10 minutos
        scheduler.schedule(delayedTask, 10, TimeUnit.MINUTES);

        // Tarea recurrente que se ejecutará cada 5 minutos
        Runnable recurringTask = () -> {
            System.out.println("Recurring task executed at: " + System.currentTimeMillis());
        };

        // Programar la tarea para que se ejecute repetidamente cada 5 minutos
        scheduler.scheduleAtFixedRate(recurringTask, 0, 5, TimeUnit.MINUTES);

        // El ScheduledExecutorService se detendrá después de 30 minutos para fines de demostración
        scheduler.schedule(() -> {
            scheduler.shutdown();
            try {
                if (!scheduler.awaitTermination(5, TimeUnit.SECONDS)) {
                    scheduler.shutdownNow();
                }
            } catch (InterruptedException e) {
                scheduler.shutdownNow();
                Thread.currentThread().interrupt();
            }
            System.out.println("Scheduler shut down at: " + System.currentTimeMillis());
        }, 30, TimeUnit.MINUTES);
    }
}
