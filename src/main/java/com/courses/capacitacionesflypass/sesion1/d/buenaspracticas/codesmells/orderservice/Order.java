package com.courses.capacitacionesflypass.sesion1.d.buenaspracticas.codesmells.orderservice;

public class Order {
    private final String description;
    private final double price;
    private final boolean applyDiscount;

    public Order(String description, double price, boolean applyDiscount) {
        this.description = description;
        this.price = price;
        this.applyDiscount = applyDiscount;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean shouldApplyDiscount() {
        return applyDiscount;
    }
}
