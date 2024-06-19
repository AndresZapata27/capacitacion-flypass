package com.courses.capacitacionesflypass.sesion1.d.buenaspracticas.convencionesnombrado;

import com.courses.capacitacionesflypass.sesion1.d.buenaspracticas.codesmells.orderservice.Order;

// Ejemplo de interfaz
public interface OrderService {
    void processOrder(Order order);
    double calculateTotal(Order order);
}
