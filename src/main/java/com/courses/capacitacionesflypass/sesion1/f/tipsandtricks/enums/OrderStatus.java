package com.courses.capacitacionesflypass.sesion1.f.tipsandtricks.enums;

public enum OrderStatus {

    PENDING("Order has been placed, but not yet processed", OrderPriority.MEDIUM),
    PROCESSING("Order is being processed", OrderPriority.HIGH),
    SHIPPED("Order has been shipped", OrderPriority.HIGH),
    DELIVERED("Order has been delivered", OrderPriority.LOW),
    CANCELLED("Order has been cancelled", OrderPriority.LOW);

    private final String description;
    private final OrderPriority priority;

    OrderStatus(String description, OrderPriority priority) {
        this.description = description;
        this.priority = priority;
    }


    // Método personalizado para verificar estados válidos
    public static boolean isValidStatus(String status) {
        for (OrderStatus s : OrderStatus.values()) {
            if (s.name().equalsIgnoreCase(status)) {
                return true;
            }
        }
        return false;
    }

    // Obtener el siguiente estado posible ejemplo de maquina de estados
    public OrderStatus getNextStatus() {
        switch (this) {
            case PENDING:
                return PROCESSING;
            case PROCESSING:
                return SHIPPED;
            case SHIPPED:
                return DELIVERED;
            default:
                return this;
        }
    }

    // Comprobar si el estado es final
    public boolean isFinalStatus() {
        return this == DELIVERED || this == CANCELLED;
    }

    // Método para obtener un estado por nombre
    public static OrderStatus getStatusByName(String name) {
        for (OrderStatus status : OrderStatus.values()) {
            if (status.name().equalsIgnoreCase(name)) {
                return status;
            }
        }
        throw new IllegalArgumentException("No enum constant " + OrderStatus.class.getCanonicalName() + "." + name);
    }

    // Método para obtener todos los estados con una prioridad específica
    public static OrderStatus[] getStatusesByPriority(OrderPriority priority) {
        return java.util.Arrays.stream(OrderStatus.values())
                .filter(status -> status.getPriority() == priority)
                .toArray(OrderStatus[]::new);
    }


    public String getDescription() {
        return description;
    }

    public OrderPriority getPriority() {
        return priority;
    }






    // Inner Enum para la prioridad del pedido
    public enum OrderPriority {

        LOW("Low priority", 1, 72),
        MEDIUM("Medium priority", 2, 48),
        HIGH("High priority", 3, 24);

        private final String description;
        private final int priorityLevel;
        private final int maxProcessingTime; // in hours

        OrderPriority(String description, int priorityLevel, int maxProcessingTime) {
            this.description = description;
            this.priorityLevel = priorityLevel;
            this.maxProcessingTime = maxProcessingTime;
        }

        public String getDescription() {
            return description;
        }

        public int getPriorityLevel() {
            return priorityLevel;
        }

        public int getMaxProcessingTime() {
            return maxProcessingTime;
        }

        public static OrderPriority getByPriorityLevel(int level) {
            for (OrderPriority priority : OrderPriority.values()) {
                if (priority.priorityLevel == level) {
                    return priority;
                }
            }
            throw new IllegalArgumentException("No OrderPriority with priority level " + level);
        }

        public boolean isHigherPriorityThan(OrderPriority other) {
            return this.priorityLevel > other.priorityLevel;
        }

        public boolean isLowerPriorityThan(OrderPriority other) {
            return this.priorityLevel < other.priorityLevel;
        }
    }
}