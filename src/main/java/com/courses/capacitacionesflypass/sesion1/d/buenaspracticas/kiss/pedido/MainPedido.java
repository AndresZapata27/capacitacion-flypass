package com.courses.capacitacionesflypass.sesion1.d.buenaspracticas.kiss.pedido;

public class MainPedido {

    public static void main(String[] args) {
        Pedido pedido = new Pedido(100.0, 5, 10, 15);
        double precioFinal = pedido.calcularPrecio();
        System.out.println("Precio final: " + precioFinal);



        PedidoBad pedidoBad = new PedidoBad(100.0, 5, 10, 15);
        pedidoBad.calcularPrecio();
        System.out.println("Precio final: " + pedidoBad.getPrecioFinal());
    }

}
