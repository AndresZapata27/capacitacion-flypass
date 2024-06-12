package com.courses.capacitacionesflypass.generalidades.clases;

public interface Volador {

    void volar();

    void aterrizar();
}

// CONTRATO, no tiene funcionalidad, solo describe que hacer - Acciones - servicios externos





class Paloma implements Volador {

    @Override
    public void volar() {
        System.out.println("construir funcionalidad de volar");
    }

    @Override
    public void aterrizar() {
        System.out.println("construir funcionalidad de aterrizar");
    }
}
