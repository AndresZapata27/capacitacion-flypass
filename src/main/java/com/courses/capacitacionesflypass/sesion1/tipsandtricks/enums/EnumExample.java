package com.courses.capacitacionesflypass.sesion1.tipsandtricks.enums;

public class EnumExample {

    public enum Status {
        PENDING,
        PROCESSING,
        COMPLETED
    }

    public static void main(String[] args) {
        Status status = Status.PENDING;
        
        switch (status) {
            case PENDING:
                System.out.println("El estado es PENDING.");
                break;
            case PROCESSING:
                System.out.println("El estado es PROCESSING.");
                break;
            case COMPLETED:
                System.out.println("El estado es COMPLETED.");
                break;
        }
    }
}
