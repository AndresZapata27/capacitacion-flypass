package com.courses.capacitacionesflypass.sesion1.d.buenaspracticas.dry.inventory.bad;


import java.util.List;

class OrderService {


    public boolean validateOrder(Order order1) {
        List<Product> products = order1.getProducts();
        int[] quantities = order1.getQuantities();

        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getStock() < quantities[i]) {
                return false;
            }
        }
        return true;
    }

    public double calculateTotalPrice(Order order1) {
        List<Product> products = order1.getProducts();
        int[] quantities = order1.getQuantities();
        double totalPrice = 0.0;

        for (int i = 0; i < products.size(); i++) {
            totalPrice += products.get(i).getPrice() * quantities[i];
        }
        return totalPrice;
    }


    public void processOrder(Order order1) {
        if (validateOrder(order1)) {
            for (int i = 0; i < order1.getProducts().size(); i++) {
                order1.getProducts().get(i).reduceStock(order1.getQuantities()[i]);
            }
            System.out.println("Order1 processed successfully!");
        } else {
            System.out.println("Order1 validation failed!");
        }
    }
}