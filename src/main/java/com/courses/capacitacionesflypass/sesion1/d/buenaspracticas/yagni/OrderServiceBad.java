package com.courses.capacitacionesflypass.sesion1.d.buenaspracticas.yagni;

public class OrderServiceBad {
    public double calculateTotal(double price, String discountType) {
        if (discountType.equals("FIXED")) {
            return price - 10;
        } else if (discountType.equals("PERCENTAGE")) {
            return price * 0.9; // Aún no se necesita
        } else if (discountType.equals("NONE")) {
            return price;
        } else {
            throw new IllegalArgumentException("Invalid discount type");
        }
    }
}
