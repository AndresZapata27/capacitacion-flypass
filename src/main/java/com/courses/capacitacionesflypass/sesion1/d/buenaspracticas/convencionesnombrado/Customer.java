package com.courses.capacitacionesflypass.sesion1.d.buenaspracticas.convencionesnombrado;

import com.courses.capacitacionesflypass.sesion1.d.buenaspracticas.codesmells.orderservice.Order;

// Ejemplo de clase
public class Customer {
    private String customerName;
    private String customerEmail;

    // Constructor
    public Customer(String customerName, String customerEmail) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
    }

    // Getters y Setters
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
}

