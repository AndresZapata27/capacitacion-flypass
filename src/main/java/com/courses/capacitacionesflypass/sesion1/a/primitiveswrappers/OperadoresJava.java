package com.courses.capacitacionesflypass.sesion1.a.primitiveswrappers;

public class OperadoresJava {
    public static void main(String[] args) {

        // Operadores aritméticos
        int a = 5 + 3;
        int b = 5 - 3;
        int c = 5 * 3;
        int d = 6 / 3;
        int e = 5 % 3;

        Integer num1 =5;
        Integer num2 =5;

        Integer resultado =   num1 + num2;

        // los ciclos o recursiones, // streams, // for each, // tener cuidado en estas operaciones
        // 2 Auto Unboxing = sacando los primitivos
        // 1 AutoBoxing  = creando un Wraper integer , creando objetos en memoria HEAP


        // Operadores de asignación
        int f = 5;
        f += 3;
        f -= 2;
        f *= 2;
        f /= 3;
        f %= 3;

        // Operadores unarios
        int g = +f;
        int h = -f;
        int i = ++f;
        int j = --f;
        boolean k = !true;

        // Operadores relacionales
        boolean l = (5 == 3);
        boolean m = (5 != 3);
        boolean n = (5 > 3);
        boolean o = (5 < 3);
        boolean p = (5 >= 3);
        boolean q = (5 <= 3);


        // Operadores lógicos corto circuito, corta las evaluaciones apenas cumple
        boolean r = (true && false && true && false);
        boolean s = (true || false);
        boolean t = !true;

        // Operadores lógicos sin corto circuito, avalua todas las condiciones
        boolean r2 = (true & false);
        boolean s2 = (true | false);


        // Operadores bit a bit, utilizado en serializadores, decoder, encoders, seguridad, certificados, compiladores

        int u = 5 & 3;    // AND a nivel de bit (&): int u = 5 & 3; // u es 1
        int v = 5 | 3;    //  OR a nivel de bit (|): int v = 5 | 3; // v es 7
        int w = 5 ^ 3;    // XOR a nivel de bit (^): int w = 5 ^ 3; // w es 6
        int x = ~5;       // Complemento a nivel de bit (~): int x = ~5; // x es -6
        int y = 5 << 1;   // Desplazamiento a la izquierda (<<): int y = 5 << 1; // y es 10
        int z = 5 >> 1;   // Desplazamiento a la derecha (>>): int z = 5 >> 1; // z es 2
        int aa = 5 >>> 1; // Desplazamiento a la derecha sin signo (>>>): int aa = 5 >>> 1; // aa es 2



        // Operador ternario
        // ******* NO USAR PARA OPERACIONES LARGAS o ANIDAR TERNARIOS = MALISIMA PRACTICA

        int bb = (5 > 3) ? 10 : 20;


        // Operador instanceof, compara CLASES, muy utilizado en tecnica de PATTERN MATCHING
        boolean cc = "Hello" instanceof String;

        Integer num = 10;
        boolean dd = num instanceof Integer;

    }
}
