package com.courses.capacitacionesflypass.sesion1.d.buenaspracticas.dry.product;

public class Main {
    public static void main(String[] args) {
        Product2 product21 = new Product2("Laptop", 1000.0);
        Product2 product2 = new Product2("Smartphone", 500.0);

        ShoppingCart2 cart = new ShoppingCart2();
        cart.addProduct(product21);
        cart.addProduct(product2);

        System.out.println("Total Price: " + cart.calculateTotalPrice());

        cart.removeProduct(product21);
        System.out.println("Total Price after removal: " + cart.calculateTotalPrice());
    }
}
