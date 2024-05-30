package com.courses.capacitacionesflypass.sesion1.f.solid.OpenClose.sin;

import com.jamiltonquintero.solid.b.OpenClose.InformeEnum;

import java.util.Arrays;
import java.util.List;

public class InformeFinanciero {

    public void generarInformeFinancieroMensual(InformeEnum tipoInforme){

        List<Long> interesesAcumulados = Arrays.asList(20L,40L,60L); //capturados, recuperados o calculados

        switch (tipoInforme){
            case CUENTA_AHORROS:
                calcularInteresMensualSegunCuenta(interesesAcumulados, 1.1, tipoInforme);
                break;
            case CUENTA_CREDITO:
                calcularInteresMensualSegunCuenta(interesesAcumulados, 1.5, tipoInforme);
                break;
            case CUENTA_AHORROS_EMPESA:
                calcularInteresMensualSegunCuentaEmpresa(interesesAcumulados, 1.5);
            case CUENTA_AHORROS_EMPESA_PEQUNA:
                calcularInteresMensualSegunCuentaEmpresa(interesesAcumulados, 1.5);
            default:
                throw new RuntimeException();
        }

    }

    private void calcularInteresMensualSegunCuenta(List<Long> interesesAcumulados, double interes, InformeEnum tipoInforme){

        var totalIntereses =interesesAcumulados.stream().map(aLong -> aLong * interes).reduce((double) 0, Double::sum);
        System.out.println("Total Intereses: " + totalIntereses);
        actualizarTotalInterese(totalIntereses, tipoInforme);

    }

    private void calcularInteresMensualSegunCuentaEmpresa(List<Long> interesesAcumulados, double interes){

        var totalIntereses =interesesAcumulados.stream().map(aLong -> aLong * interes).reduce((double) 0, Double::sum);
        System.out.println("Total Intereses: " + totalIntereses);

    }

    private void actualizarTotalInterese(Double totalIntereses, InformeEnum tipoInforme) {

        switch (tipoInforme){
            case CUENTA_AHORROS:
                System.out.println("Enviando a microservicio de cuentas ahorro "+ totalIntereses);
                break;
            case CUENTA_CREDITO:
                System.out.println("persistiendo en bd " + totalIntereses);
                break;
            case CUENTA_AHORROS_EMPESA:
            default:
                throw new RuntimeException();
        }

    }

}
