package com.courses.capacitacionesflypass.sesion2.h.anonnimclassLambdas.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaAdvancedProductExample {

    // Función para filtrar productos por precio mínimo
    private static Predicate<Product> isExpensive(double minPrice) {
        return product -> product.getPrice() > minPrice;
    }

    // Función para aplicar descuento
    private static Function<Product, Product> applyDiscount(double discount) {
        return product -> {
            product.setPrice(product.getPrice() * (1 - discount));
            return product;
        };
    }

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 1200.0),
                new Product("Phone", 800.0),
                new Product("Tablet", 600.0),
                new Product("Monitor", 300.0)
        );

        // Uso de funciones en el stream
        List<Product> discountedProducts = products.stream()
                .filter(isExpensive(500.0))
                .map(applyDiscount(0.1))
                .toList();

        //Operador de Side Effect
        discountedProducts.forEach(System.out::println);
        // Output:
        // Product{name='Laptop', price=1080.0}
        // Product{name='Phone', price=720.0}
        // Product{name='Tablet', price=540.0}
    }
}
