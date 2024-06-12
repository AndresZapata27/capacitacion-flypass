package com.courses.capacitacionesflypass.sesion1.d.buenaspracticas.yagni;

public class OrderServiceBad {
    public double calculateTotal(double price, String discountType) {
        if (discountType.equals("FIXED")) {
            return price - 10;
        } else {
            throw new IllegalArgumentException("Invalid discount type");
        }
    }
}
