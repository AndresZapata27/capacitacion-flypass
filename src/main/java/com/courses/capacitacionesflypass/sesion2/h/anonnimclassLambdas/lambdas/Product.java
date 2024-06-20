package com.courses.capacitacionesflypass.sesion2.h.anonnimclassLambdas.lambdas;

import lombok.Getter;
import lombok.Setter;

@Getter
class Product {
    private String name;
    @Setter
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + '}';
    }
}
