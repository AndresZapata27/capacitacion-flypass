package com.courses.capacitacionesflypass.sesion1.d.buenaspracticas.kiss.pedido;

public class Pedido {
    private double precioBase;
    private int cantidad;
    private double descuento;
    private double impuesto;

    public Pedido(double precioBase, int cantidad, double descuento, double impuesto) {
        this.precioBase = precioBase;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.impuesto = impuesto;
    }

    public double calcularPrecio() {
        double subtotal = precioBase * cantidad;
        double totalConDescuento = subtotal * (1 - descuento / 100);
        return totalConDescuento * (1 + impuesto / 100);
    }


}
