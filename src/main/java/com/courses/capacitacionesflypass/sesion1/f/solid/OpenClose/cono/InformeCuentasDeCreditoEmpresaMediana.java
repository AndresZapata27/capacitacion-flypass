package com.courses.capacitacionesflypass.sesion1.f.solid.OpenClose.cono;

import com.jamiltonquintero.solid.b.OpenClose.InformeEnum;

import java.util.List;

public class InformeCuentasDeCreditoEmpresaMediana implements InformeFinanciero {

    private static final double INTERESES = 1.5;

    @Override
    public InformeEnum tipo() {
        return InformeEnum.CUENTA_AHORROS_EMPESA_MEDIANA;
    }

    @Override
    public void calcularInteresMensual(List<Long> interesesAcumulados) {

        var totalIntereses =interesesAcumulados.stream().map(aLong -> aLong * INTERESES).reduce((double) 0, Double::sum);
        System.out.println("Total Intereses: " + totalIntereses);
        actualizarTotalInterese(totalIntereses);

    }

    private void actualizarTotalInterese(Double totalIntereses) {
        System.out.println("persistiendo menmrio");

    }
}
