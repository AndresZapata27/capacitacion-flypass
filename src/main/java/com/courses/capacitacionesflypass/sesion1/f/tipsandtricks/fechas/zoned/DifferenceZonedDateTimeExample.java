package com.courses.capacitacionesflypass.sesion1.f.tipsandtricks.fechas.zoned;

import java.time.ZonedDateTime;
import java.time.Duration;
import java.time.ZoneId;

public class DifferenceZonedDateTimeExample {

    public static void main(String[] args) {
        ZonedDateTime dateTime1 = ZonedDateTime.of(2024, 5, 29, 10, 0, 0, 0, ZoneId.of("Europe/Paris"));
        ZonedDateTime dateTime2 = ZonedDateTime.of(2024, 5, 30, 12, 30, 0, 0, ZoneId.of("Asia/Tokyo"));

        Duration duration = Duration.between(dateTime1, dateTime2);
        System.out.println("Duración entre las dos fechas y horas: " + duration.toHours() + " horas");
    }
}
