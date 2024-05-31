package com.courses.capacitacionesflypass.sesion1.d.buenaspracticas.dry.inventory.bad;

import java.util.List;

class Order {
    private List<Product> products;
    private int[] quantities;

    public Order(List<Product> products, int[] quantities) {
        this.products = products;
        this.quantities = quantities;
    }

    public List<Product> getProducts() {
        return products;
    }

    public int[] getQuantities() {
        return quantities;
    }
}