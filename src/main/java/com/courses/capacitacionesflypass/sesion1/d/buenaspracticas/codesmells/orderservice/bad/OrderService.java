package com.courses.capacitacionesflypass.sesion1.d.buenaspracticas.codesmells.orderservice.bad;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// Clase con múltiples responsabilidades (God Class)
public class OrderService {

    public List<String> list = new ArrayList<>();
    public int total = 0;
    public double t = 0.0;
    public double d = 0.05;


    // Constructor innecesario (Speculative Generality)
    public OrderService(String config) {
        // Configuración no utilizada Yagni

    }

    // Método con demasiadas responsabilidades (Long Method, Feature Envy)
    public void proces(String order, double price, boolean applyDiscount) {


        String orderInFile = null;

        try {
            orderInFile = readFileAsString("ruta/al/archivo_orders.txt");
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }


        list.add(orderInFile);

        list.add(order);
        total++;

        // Calcular precio con descuento (Feature Envy)
        double finalPrice = price;
        if (applyDiscount) {
            finalPrice = price - (price * d);
        }

        // Actualizar ingresos totales (Long Method)
        t += finalPrice;

        // Registro del pedido procesado (Comments)
        System.out.println("Order processed: " + order);
    }

    public static String readFileAsString(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)), StandardCharsets.UTF_8);
    }


    // Método que realiza múltiples operaciones sin relación (Long Method, Data Clump)
    public void print() {
        System.out.println("Total Orders: " + total);
        System.out.println("Total Revenue: " + t);
        System.out.println("Average Revenue per Order: " + (t / total));
    }

    // Método que devuelve una lista que puede ser modificada (Leaking Abstraction)
    public List<String> getList() {
        return list;
    }
}
