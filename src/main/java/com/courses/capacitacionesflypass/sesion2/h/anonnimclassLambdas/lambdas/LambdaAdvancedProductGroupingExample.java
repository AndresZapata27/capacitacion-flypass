package com.courses.capacitacionesflypass.sesion2.h.anonnimclassLambdas.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class LambdaAdvancedProductGroupingExample {

    // Función para validar si un producto tiene un precio válido
    private static Predicate<Product> isValidPrice(double minPrice, double maxPrice) {
        return product -> product.getPrice() >= minPrice && product.getPrice() <= maxPrice;
    }

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 1200.0),
                new Product("Phone", 800.0),
                new Product("Tablet", 600.0),
                new Product("Monitor", 300.0),
                new Product("Keyboard", 50.0)
        );

        // Definir el rango de precios válidos
        double minPrice = 100.0;
        double maxPrice = 1000.0;

        Predicate<Product> isValidPriceLambda = product -> product.getPrice() >= minPrice && product.getPrice() <= maxPrice;

        // Uso de funciones en el stream para agrupar productos válidos e inválidos por precio
        Map<Boolean, List<Product>> groupedByPriceValidity = products.stream()
                .collect(Collectors.partitioningBy(isValidPrice(minPrice, maxPrice)));

        System.out.println("Productos Válidos: " + groupedByPriceValidity.get(true));
        // Output: Productos Válidos: [Product{name='Phone', price=800.0}, Product{name='Tablet', price=600.0}, Product{name='Monitor', price=300.0}]

        System.out.println("Productos Inválidos: " + groupedByPriceValidity.get(false));
        // Output: Productos Inválidos: [Product{name='Laptop', price=1200.0}, Product{name='Keyboard', price=50.0}]
    }
}
