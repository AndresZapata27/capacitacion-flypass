package com.courses.capacitacionesflypass.sesion1.f.tipsandtricks.var;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class VarComplexInitializationExample {

    public static void main(String[] args) {
        var date = LocalDate.now();
        var time = LocalTime.now();
        var dateTime = LocalDateTime.now();

        System.out.println("Fecha actual: " + date);
        System.out.println("Hora actual: " + time);
        System.out.println("Fecha y hora actual: " + dateTime);
    }
}
