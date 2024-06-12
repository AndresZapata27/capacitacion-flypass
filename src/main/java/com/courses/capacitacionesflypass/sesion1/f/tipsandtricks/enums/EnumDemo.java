package com.courses.capacitacionesflypass.sesion1.f.tipsandtricks.enums;

public class EnumDemo {

    public static void main(String[] args) {



        // Mostrar todos los valores del enum principal, prioridades y ordinal
        System.out.println("Order Statuses with Priorities:");
        for (OrderStatus status : OrderStatus.values()) {

            System.out.println("Ordinal:" + status.ordinal());
            System.out.println("PayStrategies: " + status + ", Description: " + status.getDescription() + ", Priority: " + status.getPriority());
        }

        // Uso de un método personalizado en el enum
        System.out.println("\nVerificación de estados válidos:");
        System.out.println("Is PENDING a valid state? " + OrderStatus.isValidStatus("PENDING"));
        System.out.println("Is UNKNOWN a valid state? " + OrderStatus.isValidStatus("UNKNOWN"));


        // Obtener el siguiente estado posible
        OrderStatus currentStatus = OrderStatus.PENDING;
        System.out.println("\nNext status after " + currentStatus + " is " + currentStatus.getNextStatus());

        // Verificar si un estado es final
        OrderStatus finalStatus = OrderStatus.DELIVERED;
        System.out.println("\nIs " + finalStatus + " a final status? " + finalStatus.isFinalStatus());

        // Obtener un estado por nombre
        String statusName = "SHIPPED";
        try {
            OrderStatus statusByName = OrderStatus.getStatusByName(statusName);
            System.out.println("\nOrder status by name (" + statusName + "): " + statusByName + ", Description: " + statusByName.getDescription());
        } catch (IllegalArgumentException e) {
            System.out.println("\nInvalid status name: " + statusName);
        }

        // Obtener todos los estados con una prioridad específica
        OrderStatus.OrderPriority priority = OrderStatus.OrderPriority.HIGH;
        System.out.println("\nOrder statuses with priority " + priority + ":");

        OrderStatus[] statusesByPriority = OrderStatus.getStatusesByPriority(priority);
        for (OrderStatus status : statusesByPriority) {
            System.out.println(status + " (" + status.getDescription() + ")");
        }
    }
}
