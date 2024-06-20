package com.courses.capacitacionesflypass.sesion2.i.concurrenceparallelism;

public class OldConcurrencyExample {
    public static void main(String[] args) {
        // Crear un hilo mediante una clase que implementa Runnable
        Runnable task = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Running in thread: " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000); // Simular trabajo
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        };

        // Crear y arrancar el hilo
        Thread thread = new Thread(task);
        thread.start();

        // Esperar a que el hilo termine
        try {
            thread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Main thread finished.");
    }
}
