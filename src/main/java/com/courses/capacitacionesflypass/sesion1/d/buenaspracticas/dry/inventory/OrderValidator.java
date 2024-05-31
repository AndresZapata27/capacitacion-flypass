package com.courses.capacitacionesflypass.sesion1.d.buenaspracticas.dry.inventory;

class OrderValidator {
    private InventoryService inventoryService;

    public OrderValidator(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    public boolean validateOrder(Order order) {
        for (int i = 0; i < order.getProducts().size(); i++) {
            if (!inventoryService.checkStock(order.getProducts().get(i), order.getQuantities()[i])) {
                return false;
            }
        }
        return true;
    }
}
