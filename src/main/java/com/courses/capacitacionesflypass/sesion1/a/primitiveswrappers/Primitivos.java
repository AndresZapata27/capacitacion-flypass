package com.courses.capacitacionesflypass.sesion1.a.primitiveswrappers;

public class Primitivos {

    public static void main(String[] args) {

        // Tipos de Datos PRIMITIVOS Enteros

        byte maxByte = 127;
        byte minByte = -128;

        short maxShort = 32_767;
        short minShort = -32_768;

        int maxInt = 2_147_483_647;
        int minInt = -2_147__483_648;

        long maxLong = 9__223_372__036_854__775_807L;
        long minLong = -9_223_372_036_854_775_808L;

        // Tipos de Datos PRIMITIVOS de Punto Flotante o Decimales
        // Problematica computacional de bytes en operaciones aritmeticas,
        // Si se necesita mucha precision en calculos, como dinero
        // SOLUCION = Api de Math o Bigdecimal.

        float maxFloat = 3.4028235E38F;
        float minFloat = 1.4E-45F;

        double maxDouble = 1.7976931348623157E308;
        double minDouble = 4.9E-324;

        //Tipos de Dato Carácter
        char letra = 'A';
        char unicodeChar = '\u0041';  // Representa 'A'
        char numericChar = 65;  // Representa 'A', ya que 65 es el valor ASCII de 'A'


        boolean bool = true;
        boolean bool2 = false;

    }
}
