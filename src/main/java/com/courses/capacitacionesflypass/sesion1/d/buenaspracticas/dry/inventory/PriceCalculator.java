package com.courses.capacitacionesflypass.sesion1.d.buenaspracticas.dry.inventory;

class PriceCalculator {
    public double calculateTotalPrice(Order order) {
        double totalPrice = 0.0;
        for (int i = 0; i < order.getProducts().size(); i++) {
            totalPrice += order.getProducts().get(i).getPrice() * order.getQuantities()[i];
        }
        return totalPrice;
    }
}
