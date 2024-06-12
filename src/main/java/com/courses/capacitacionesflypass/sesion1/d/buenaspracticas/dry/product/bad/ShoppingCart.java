package com.courses.capacitacionesflypass.sesion1.d.buenaspracticas.dry.product.bad;


import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private List<Product> product2s;

    public ShoppingCart() {
        product2s = new ArrayList<>();
    }

    // Validaciones , Comparaciones , Creaciones de Objetos
    public void addProduct(Product product2) {
        if (product2 == null || product2.getPrice() <= 0) {
            throw new IllegalArgumentException("Invalid product2");
        }
        product2s.add(product2);
    }

    public void removeProduct(Product product) {
        if (product == null || !product2s.contains(product)) {
            throw new IllegalArgumentException("Product2 not found in cart");
        }
        product2s.remove(product);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (Product product : product2s) {
            if (product.getPrice() <= 0) {
                throw new IllegalArgumentException("Invalid product2 price");
            }
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public List<Product> getProducts() {
        return product2s;
    }
}
