package com.courses.capacitacionesflypass.sesion1.d.buenaspracticas.convencionesnombrado;

import com.courses.capacitacionesflypass.sesion1.d.buenaspracticas.codesmells.orderservice.Order;

import java.util.List;

public class Config {

    public static final int MAX_ATTEMPTS = 5;
    public static final int DEFAULT_TIMEOUT = 3000; // en milisegundos
    public static final String BASE_URL = "https://api.companyname.com";

    private double totalAmount;
    private String customerName;
    private List<Order> orderList;


    // Métodos que utilizan las constantes
    public static void printConfig() {
        System.out.println("Max Attempts: " + MAX_ATTEMPTS);
        System.out.println("Default Timeout: " + DEFAULT_TIMEOUT + "ms");
        System.out.println("Base URL: " + BASE_URL);
    }
}
