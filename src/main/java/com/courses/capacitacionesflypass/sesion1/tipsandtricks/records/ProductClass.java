package com.courses.capacitacionesflypass.sesion1.tipsandtricks.records;

import java.util.Objects;

public class ProductClass {
    private final String id;
    private final String name;
    private final double price;

    public ProductClass(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ProductClass{id='" + id + "', name='" + name + "', price=" + price + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductClass productClass = (ProductClass) o;
        return Double.compare(productClass.price, price) == 0 && id.equals(productClass.id) && name.equals(productClass.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }
}
