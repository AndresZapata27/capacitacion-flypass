package com.courses.capacitacionesflypass.sesion2.j.designpattern.comportamiento.strategy;

public class StrategyExample {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Pagar con tarjeta de crédito
        cart.setPaymentStrategy(new CreditCardStrategy("1234-5678-9876-5432"));
        cart.checkout(100);

        // Pagar con PayPal
        cart.setPaymentStrategy(new PayPalStrategy("user@example.com"));
        cart.checkout(200);

        // Pagar con Google Pay
        cart.setPaymentStrategy(new GooglePayStrategy("user@google.com"));
        cart.checkout(300);
    }
}
