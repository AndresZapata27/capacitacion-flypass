package com.courses.capacitacionesflypass.sesion1.f.tipsandtricks.fechas;

import java.time.LocalDate;

public class DateManipulationExample {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(1);
        LocalDate nextMonth = today.plusMonths(1);
        LocalDate previousYear = today.minusYears(1);

        System.out.println("Hoy: " + today);
        System.out.println("Mañana: " + tomorrow);
        System.out.println("Próximo mes: " + nextMonth);
        System.out.println("Año anterior: " + previousYear);
    }
}
