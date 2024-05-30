package com.courses.capacitacionesflypass.sesion1.f.solid.SingleResponsability.casoUno;

import lombok.Value;

import java.math.BigDecimal;

public class GestorDeCuentaAhorro {

    @Value("calculo-interes-anual")
    public  String valorInteres;

    private Long idCuenta;

    private String numeroTarjeta;

    private String titular;

    private BigDecimal saldo;
    private String usuario;

    public void calcularIntereses(String valorInteres) {
        BigDecimal interes = saldo.multiply(new BigDecimal(valorInteres));
        saldo = saldo.add(interes);
    }

    public void descontarSaldoPorTransferencia(BigDecimal transferencia) {
        if (transferencia.compareTo(saldo) <= 0){
            throw new RuntimeException("No tienes saldo suficiente para esta transaccion");
        }
        saldo = saldo.subtract(transferencia);
    }

}
