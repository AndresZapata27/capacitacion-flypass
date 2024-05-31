package com.courses.capacitacionesflypass.sesion1.d.buenaspracticas.codesmells.orderservice;

public class Main {


    public static void main(String[] args) {

        DiscountCalculator discountCalculator = new DiscountCalculator(0.5);

        OrderService orderService = new OrderService(discountCalculator); //Inversion de Control

        Order order1 = new Order("Laptop", 1000.0, true);
        Order order2 = new Order("Smartphone", 500.0, false);

        orderService.processOrder(order1);
        orderService.processOrder(order2);

        orderService.printSummary();
    }
}
