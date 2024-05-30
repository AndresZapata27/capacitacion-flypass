package com.courses.capacitacionesflypass.sesion1.tipsandtricks.fechas.zoned;

import java.time.ZonedDateTime;
import java.time.ZoneId;

public class ZonedDateTimeExample {

    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Fecha y hora actual con zona horaria: " + zonedDateTime);
        
        ZonedDateTime zonedDateTimeInParis = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("Fecha y hora actual en París: " + zonedDateTimeInParis);
    }
}
