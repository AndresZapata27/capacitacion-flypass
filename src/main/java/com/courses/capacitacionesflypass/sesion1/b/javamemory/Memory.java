package com.courses.capacitacionesflypass.sesion1.b.javamemory;

public class Memory {

    public static void main(String[] args) {

        objetosGenericosHeap();

        // objetosHeap();

        // integerCache();

        // integerOmitirCacheCreacionExplicita();

         //stringPool();

        //omitirStringPoolCreacionExplicita();

        // objetosGenericosHeap();


    }

    static void primitivosStack(){




    }


    static void objetosHeap(){



    }


    // Para integer -127  y 127
    static void integerCache(){

        System.out.println("\n -- integerCache");

        Integer a = 127;  // Utiliza la cache
        Integer b = 127;  // Utiliza la misma instancia de la cache
        System.out.println(a == b);  // true

        Integer c = 128;  // Fuera del rango de la cache
        Integer d = 128;  // Nueva instancia
        System.out.println(c == d);  // false


        int a1 = 127;
        int b1 = 127;
        System.out.println(a1 == b1);

        int c1 = 128;
        int d1 = 128;
        System.out.println(c1 == d1);  // true


    }


    static void integerOmitirCacheCreacionExplicita(){



    }


    static void stringPool(){

        System.out.println("\n -- stringPool");

        String a = "Hola mundo";
        String b = "Hola mundo";

        if(a == b){
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

    }

    static void omitirStringPoolCreacionExplicita(){


    }

    static void objetosGenericosHeap(){

        System.out.println("\n -- objetosGenericosHeap");

        ObjetoGenerico a = new ObjetoGenerico();
        ObjetoGenerico b = new ObjetoGenerico(); //= a;


        a.numero = 500;
        b.numero = 500;


        System.out.println(a.numero);
        System.out.println(b.numero);

        if(a == b){
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }


        if(a.equals(b)){
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

    }


}
