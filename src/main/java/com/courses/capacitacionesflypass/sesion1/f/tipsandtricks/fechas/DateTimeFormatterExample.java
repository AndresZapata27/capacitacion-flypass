package com.courses.capacitacionesflypass.sesion1.f.tipsandtricks.fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {

    public static void main(String[] args) {
        format();
        parse();
    }

    public static void format() {

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDateTime = dateTime.format(formatter);
        System.out.println("Fecha y hora formateada: " + formattedDateTime);
    }


    public static void parse() {

        String dateString = "29-05-2024";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate date = LocalDate.parse(dateString, formatter);
        System.out.println("Fecha parseada: " + date);
    }
}
