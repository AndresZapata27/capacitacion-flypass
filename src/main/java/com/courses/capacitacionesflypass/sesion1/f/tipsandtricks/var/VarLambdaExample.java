package com.courses.capacitacionesflypass.sesion1.f.tipsandtricks.var;

import java.util.function.Function;

public class VarLambdaExample {

    public static void main(String[] args) {
        Function<String, String> upperCaseFunction = (var s) -> s.toUpperCase();
        
        var result = upperCaseFunction.apply("hola mundo");
        System.out.println("Resultado: " + result);
    }
}
