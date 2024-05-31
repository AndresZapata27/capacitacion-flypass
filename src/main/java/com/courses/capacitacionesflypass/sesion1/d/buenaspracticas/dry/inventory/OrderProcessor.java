package com.courses.capacitacionesflypass.sesion1.d.buenaspracticas.dry.inventory;

class OrderProcessor {
    private OrderValidator orderValidator;
    private InventoryService inventoryService;

    public OrderProcessor(OrderValidator orderValidator, InventoryService inventoryService) {
        this.orderValidator = orderValidator;
        this.inventoryService = inventoryService;
    }

    public void processOrder(Order order) {
        if (orderValidator.validateOrder(order)) {
            for (int i = 0; i < order.getProducts().size(); i++) {
                inventoryService.updateStock(order.getProducts().get(i), order.getQuantities()[i]);
            }
            System.out.println("Order processed successfully!");
        } else {
            System.out.println("Order validation failed!");
        }
    }
}
