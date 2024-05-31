package com.courses.capacitacionesflypass.sesion1.d.buenaspracticas.dry.product.bad;



public class MainBad {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1000.0);
        Product product2 = new Product("Smartphone", 500.0);

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(product1);
        cart.addProduct(product2);

        System.out.println("Total Price: " + cart.calculateTotalPrice());

        cart.removeProduct(product1);
        System.out.println("Total Price after removal: " + cart.calculateTotalPrice());
    }
}
