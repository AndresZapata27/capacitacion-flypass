package com.courses.capacitacionesflypass.sesion1.d.buenaspracticas.kiss.pedido;

public class PedidoBad {
    private double precioBase;
    private int cantidad;
    private double descuento;
    private double impuesto;
    private double precioFinal;

    public PedidoBad(double precioBase, int cantidad, double descuento, double impuesto) {
        this.precioBase = precioBase;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.impuesto = impuesto;
        this.precioFinal = 0.0;
    }

    public void calcularPrecio() {
        double subtotal = precioBase * cantidad;
        double descuentoCalculado = subtotal * (descuento / 100);
        double totalConDescuento = subtotal - descuentoCalculado;
        double impuestoCalculado = totalConDescuento * (impuesto / 100);
        this.precioFinal = totalConDescuento + impuestoCalculado;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }


}
