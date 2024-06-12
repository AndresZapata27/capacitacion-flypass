package com.courses.capacitacionesflypass.sesion1.f.tipsandtricks.fechas;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class TimeIntervalExample {

    public static void main(String[] args) {

        LocalDateTime startDateTime = LocalDateTime.of(2023, 5, 29, 14, 33);
        LocalDateTime endDateTime = LocalDateTime.of(2024, 5, 29, 18, 45);

        Duration duration = Duration.between(startDateTime, endDateTime);

        Period period = Period.between(startDateTime.toLocalDate(), endDateTime.toLocalDate());

        System.out.println("Duración en horas: " + duration.toHours());
        System.out.println("Periodo en meses: " + period.toTotalMonths());
    }
}
