package com.courses.capacitacionesflypass.sesion1.a.primitiveswrappers;

public class ErroresConPrimitivos {

    public static void main(String[] args) {


        perdidaDeInformacionEnCastingDirecto();

    }

    static void noInicializacion(){

        int numero = 0;  // Error: la variable no está inicializada

        System.out.println(numero);

    }


    //Sucede a menudo en mapeos de respues de la BD en JDBC o JPA
    static void desvordamientoDeBytes(){
        //Desvordamiento

        //byte maxByte = 129;
        //byte minByte = -129;

        short maxShort = 32_767;
        //short minShort = -32_769;

        //int maxInt = 2_147_483_648;
        //int minInt = -2_147_483_649;

        //long maxLong = 9_223_372_036_854_775_809L;
        //long minLong = -9_223_372_036_854_775_809L;
    }

    static void perdidaDeInformacionEnCastingDirecto(){
        //Pérdida de datos al convertir entre tipos de datos.

        long entero = (int) 9_999_999_999_999_999L;



        int i = (int) 3.9;  // La conversión puede perder datos, resultado será 3
        float f = 3.9f;



        double d =  (entero / f);   // da errores al dividir entero entre float o double

        double d1 =  ( (double) entero / f);   // las divisiones deben tener tanto dividendo como divisor de tipo punto flotante

    }



    //Comparar valores de punto flotante directamente puede ser problemático debido a la precisión.
    // se debe considerar un margen de error, o usar
    static void comparacionFlotantes(){



    }
}
