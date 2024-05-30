package com.courses.capacitacionesflypass.sesion1.f.solid.OpenClose.cono;

import com.jamiltonquintero.solid.b.OpenClose.InformeEnum;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.Set;

public class InformeFachada {

    private EnumMap<InformeEnum, InformeFinanciero> informes;

    public InformeFachada(Set<InformeFinanciero> tipos) {
        this.informes = new EnumMap<>(InformeEnum.class);
        tipos.forEach(informeFinanciero -> this.informes.put(informeFinanciero.tipo(), informeFinanciero));
    }

    public void generarInformeFinancieroMensual(InformeEnum tipoInforme){

        List<Long> interesesAcumulados = Arrays.asList(20L,40L,60L); //capturados, recuperados o calculados

        this.informes.get(tipoInforme).calcularInteresMensual(interesesAcumulados);

        // notificar

        System.out.println("Notificado con exito a quien corresponda");

    }

}
