package com.courses.capacitacionesflypass.sesion1.f.solid.OpenClose.sin;


import com.jamiltonquintero.solid.b.OpenClose.InformeEnum;

public class Main {


    public static void main(String[] args) {


        InformeFinanciero informeFinanciero = new InformeFinanciero();
        informeFinanciero.generarInformeFinancieroMensual(InformeEnum.CUENTA_CREDITO);
    }
}