package com.courses.capacitacionesflypass.sesion1.d.buenaspracticas.dry.inventory.bad;


class InventoryService {
    public boolean checkStock(Product product, int quantity) {
        return product.getStock() >= quantity;
    }

    public void updateStock(Product product, int quantity) {
        product.reduceStock(quantity);
    }
}