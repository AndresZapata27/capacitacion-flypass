package com.courses.capacitacionesflypass.sesion1.f.tipsandtricks.enums;

public class EnumExample {

    public enum PayStrategies {
        CARD,
        DEBIT,
        PAYPAL;
    }

    public static void main(String[] args) {
        PayStrategies payStrategies = PayStrategies.CARD;
        
        switch (payStrategies) {
            case CARD:
                System.out.println("El estado es PENDING.");
                break;
            case DEBIT:
                System.out.println("El estado es PROCESSING.");
                break;
            case PAYPAL:
                System.out.println("El estado es COMPLETED.");
                break;
        }
    }
}
