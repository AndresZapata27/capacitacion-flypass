package com.courses.capacitacionesflypass.sesion1.f.solid.OpenClose.cono;


import com.jamiltonquintero.solid.b.OpenClose.InformeEnum;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<InformeFinanciero> informes = new HashSet<>();
        informes.add(new InformeCuentasDeCredito());
        informes.add(new InformeCuentasDeAhorro());

        InformeFachada informeFachada = new InformeFachada(informes);
        informeFachada.generarInformeFinancieroMensual(InformeEnum.CUENTA_CREDITO);
    }
}