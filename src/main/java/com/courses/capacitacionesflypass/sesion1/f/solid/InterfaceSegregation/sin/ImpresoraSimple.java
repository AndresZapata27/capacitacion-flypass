package com.courses.capacitacionesflypass.sesion1.f.solid.InterfaceSegregation.sin;

class ImpresoraSimple implements Impresora {
    @Override
    public void imprimir() {
        System.out.println("Imprimiendo...");
    }

    // implementarlos debido a la interfaz.
    @Override
    public void escanear() {
        // No se puede escanear
    }

    @Override
    public void enviarFax() {
        // No se puede enviar fax
    }
}