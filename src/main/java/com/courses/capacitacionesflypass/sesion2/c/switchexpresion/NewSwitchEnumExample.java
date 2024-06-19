package com.courses.capacitacionesflypass.sesion2.c.switchexpresion;

public class NewSwitchEnumExample {
    enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }

    public static void main(String[] args) {
        Day day = Day.WEDNESDAY;

        String activity = switch (day) {
            case MONDAY -> "Work";
            case TUESDAY -> "Gym";
            case WEDNESDAY -> "Study";
            case THURSDAY -> "Meeting";
            case FRIDAY -> "Party";
            case SATURDAY -> "Rest";
            case SUNDAY -> "Family Time";
        };

        System.out.println("Activity: " + activity);
    }
}
