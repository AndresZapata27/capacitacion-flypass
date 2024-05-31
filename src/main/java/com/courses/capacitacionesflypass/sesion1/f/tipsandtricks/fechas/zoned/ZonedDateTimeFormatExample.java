package com.courses.capacitacionesflypass.sesion1.f.tipsandtricks.fechas.zoned;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeFormatExample {

    public static void main(String[] args) {
        String dateTimeString = "2024-05-29T10:15:30+02:00[Europe/Paris]";
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(dateTimeString);
        System.out.println("Fecha y hora parseada: " + zonedDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss Z VV");
        String formattedDateTime = zonedDateTime.format(formatter);
        System.out.println("Fecha y hora formateada: " + formattedDateTime);
    }
}
