package com.courses.capacitacionesflypass.sesion1.d.buenaspracticas.dry.product;

import java.util.ArrayList;
import java.util.List;

class ShoppingCart2 {
    private List<Product2> product2s;

    public ShoppingCart2() {
        product2s = new ArrayList<>();
    }

    public void addProduct(Product2 product2) {
        validateProduct(product2); // Siempre se van agregar OK
        product2s.add(product2);
    }

    public void removeProduct(Product2 product2) {
        if (product2 == null || !product2s.contains(product2)) {
            throw new IllegalArgumentException("Product2 not found in cart");
        }
        product2s.remove(product2);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (Product2 product2 : product2s) {
            validateProduct(product2);
            totalPrice += product2.getPrice();
        }
        return totalPrice;
    }

    private void validateProduct(Product2 product2) {
        if (product2 == null || product2.getPrice() <= 0) {
            throw new IllegalArgumentException("Invalid product2");
        }
    }

    public List<Product2> getProducts() {
        return product2s;
    }
}
