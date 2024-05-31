package com.courses.capacitacionesflypass.sesion1.f.tipsandtricks.fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeExample {

    //Evitar las Clases Viejas (Date, Calendar)

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Fecha actual: " + date);
        System.out.println("Hora actual: " + time);
        System.out.println("Fecha y hora actual: " + dateTime);
    }
}
