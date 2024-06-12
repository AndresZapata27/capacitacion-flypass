package com.courses.capacitacionesflypass.sesion1.f.tipsandtricks.fechas;

import java.time.LocalDate;

public class DateComparisonExample {

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2024, 5, 29);
        LocalDate date2 = LocalDate.of(2024, 5, 29);

        boolean isBefore = date1.isBefore(date2);
        boolean isAfter = date1.isAfter(date2);
        boolean isEqual = date1.isEqual(date2);

        System.out.println("Fecha 1 es antes de Fecha 2: " + isBefore);
        System.out.println("Fecha 1 es después de Fecha 2: " + isAfter);
        System.out.println("Fecha 1 es igual a Fecha 2: " + isEqual);
    }
}
