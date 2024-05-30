package com.courses.capacitacionesflypass.sesion1.f.solid.SingleResponsability.casoUno;

import java.math.BigDecimal;

public class GestorDeCuenta {

    private Long id;

    private String numero;

    private String titular;

    private BigDecimal saldo;

    public void calcularIntereses() {
        BigDecimal interes = saldo.multiply(new BigDecimal("0.05"));
        saldo = saldo.add(interes);
    }

    public void descontarSaldoPorTransferencia(BigDecimal transferencia) {
        if (transferencia.compareTo(saldo) <= 0){
            throw new RuntimeException("No tienes saldo suficiente para esta transaccion");
        }
        saldo = saldo.subtract(transferencia);
    }

}
