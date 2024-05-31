package com.courses.capacitacionesflypass.sesion1.f.tipsandtricks.fechas.zoned;

import java.time.ZonedDateTime;
import java.time.ZoneId;

public class CompareZonedDateTimeExample {

    public static void main(String[] args) {
        ZonedDateTime dateTime1 = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        ZonedDateTime dateTime2 = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

        boolean isBefore = dateTime1.isBefore(dateTime2);
        boolean isAfter = dateTime1.isAfter(dateTime2);
        boolean isEqual = dateTime1.isEqual(dateTime2);

        System.out.println("Fecha y hora en París es antes de Tokio: " + isBefore);
        System.out.println("Fecha y hora en París es después de Tokio: " + isAfter);
        System.out.println("Fecha y hora en París es igual a Tokio: " + isEqual);
    }
}
