package com.courses.capacitacionesflypass.sesion1.d.buenaspracticas.dry.inventory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Laptop", 1000.0, 10);
        Product product2 = new Product("Smartphone", 500.0, 20);

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);

        int[] quantities = {1, 2};
        Order order = new Order(products, quantities);

        InventoryService inventoryService = new InventoryService();
        OrderValidator orderValidator = new OrderValidator(inventoryService);
        OrderProcessor orderProcessor = new OrderProcessor(orderValidator, inventoryService);

        orderProcessor.processOrder(order);

        System.out.println("Stock for product1: " + product1.getStock());
        System.out.println("Stock for product2: " + product2.getStock());
    }
}
