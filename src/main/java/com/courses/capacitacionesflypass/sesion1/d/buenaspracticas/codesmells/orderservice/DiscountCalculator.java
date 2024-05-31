package com.courses.capacitacionesflypass.sesion1.d.buenaspracticas.codesmells.orderservice;

public class DiscountCalculator {
    private final double discountRate;

    public DiscountCalculator(double discountRate) {
        this.discountRate = discountRate;
    }

    public double calculateDiscountedPrice(double price, boolean applyDiscount) {
        if (applyDiscount) {
            return price - (price * discountRate);
        }
        return price;
    }
}
