package com.courses.capacitacionesflypass.sesion1.e.excepciones.resultpatter;

public class Calculator {

    public static Result<Double> divide(double numerator, double denominator) {

        if (denominator == 0) {
            return Result.failure("Division by zero is not allowed.");
        }

        return Result.success(numerator / denominator);


    }

    // Clases de dominio, modelos, entidades, dtos, request, record, ricas en validaciones
    // muchas condiciones y combinatorias de errores por campos


    public static void main(String[] args) {

        Result<Double> result = divide(10, 2);

        if (result.isSuccess()) {
            System.out.println("Result: " + result.getValue());
        } else {
            System.err.println("Error: " + result.getErrorMessage());
        }

        Result<Double> errorResult = divide(10, 0);

        if (errorResult.isSuccess()) {
            System.out.println("Result: " + errorResult.getValue());
        } else {
            System.err.println("Error: " + errorResult.getErrorMessage());
        }
    }
}
