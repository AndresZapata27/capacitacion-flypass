package com.courses.capacitacionesflypass.sesion1.a.primitiveswrappers;

public class Wrappers {

    public static void main(String[] args) {

        // Tipos de Datos WRAPPERS Enteros

        Byte maxByte = Byte.MAX_VALUE;
        Byte minByte = Byte.MIN_VALUE;

        Short maxShort = Short.MAX_VALUE;
        Short minShort = Short.MIN_VALUE;

        Integer maxInt = Integer.MIN_VALUE;
        Integer minInt = Integer.MIN_VALUE;

        Long maxLong = Long.MAX_VALUE;
        Long minLong = Long.MIN_VALUE;


        // Tipos de Datos WRAPPERS de Punto Flotante o Decimales

        Float maxFloat = Float.MAX_VALUE;
        Float minFloat = Float.MIN_VALUE;

        Double maxDouble = Double.MAX_VALUE;
        Double minDouble = Double.MIN_VALUE;


        //TIpos de Dato Carácter
        Character letra = Character.valueOf('A');
        Character unicodeChar = Character.valueOf('\u0041');  // Representa 'A'
        Character numericChar = Character.valueOf((char) 65);  // Representa 'A', ya que 65 es el valor ASCII de 'A'


        Boolean bool = Boolean.valueOf(true);
        Boolean boolStringTrue = Boolean.valueOf("true");  // "TRUE"  ignore case
        Boolean boolString = Boolean.valueOf("false"); // "FALSE"  ignore case


        //OPERACIONES CON WRAPPERS

        maxByte.compareTo((byte) 127);

        maxInt.doubleValue();
        maxInt.shortValue();

        Integer.sum(maxInt,minInt);

        Integer.parseInt("5060");


    }
}
