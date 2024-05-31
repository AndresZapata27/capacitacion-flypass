package com.courses.capacitacionesflypass.sesion1.d.buenaspracticas.codesmells.orderservice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Clase con responsabilidad única (Single Responsibility Principle)
public class OrderService {

    private final List<Order> orders = new ArrayList<>();
    private final DiscountCalculator discountCalculator;

    public OrderService(DiscountCalculator discountCalculator) {
        this.discountCalculator = discountCalculator;
    }

    // Método con responsabilidad clara (Extract Method)
    public void processOrder(Order order) {
        double finalPrice = discountCalculator.calculateDiscountedPrice(order.getPrice(), order.shouldApplyDiscount());
        orders.add(order);
        logOrder(order.getDescription(), finalPrice);
    }

    public void printSummary() {
        System.out.println("Total Orders: " + getTotalOrders());
        System.out.println("Total Revenue: " + getTotalRevenue());
        System.out.println("Average Revenue per Order: " + getAverageRevenuePerOrder());
    }

    // Método que devuelve una lista inmutable (Encapsulation)
    public List<Order> getOrders() {
        return Collections.unmodifiableList(orders);
    }




    private void logOrder(String description, double finalPrice) {
        System.out.println("Order processed: " + description + " with final price: " + finalPrice);
    }

    // Métodos cortos y específicos (Short Methods)
    private int getTotalOrders() {
        return orders.size();
    }

    private double getTotalRevenue() {
        return orders.stream()
            .mapToDouble(order -> discountCalculator.calculateDiscountedPrice(order.getPrice(), order.shouldApplyDiscount()))
            .sum();
    }

    private double getAverageRevenuePerOrder() {
        return getTotalRevenue() / getTotalOrders();
    }


}

