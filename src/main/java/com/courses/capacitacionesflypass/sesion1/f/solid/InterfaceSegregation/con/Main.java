package com.courses.capacitacionesflypass.sesion1.f.solid.InterfaceSegregation.con;

class ImpresoraSimple implements Imprimible {
    @Override
    public void imprimir() {
        System.out.println("Imprimiendo...");
    }

    @Override
    public void imprimir2() {

    }

    @Override
    public void imprimirAColor2() {

    }
}

class ImpresoraMultifuncional implements Imprimible, Escaneable, Faxeable {
    @Override
    public void imprimir() {
        System.out.println("Imprimiendo...");
    }

    @Override
    public void escanear() {
        System.out.println("Escaneando...");
    }

    @Override
    public void enviarFax() {
        System.out.println("Enviando fax...");
    }

    @Override
    public void imprimir2() {

    }

    @Override
    public void imprimirAColor2() {

    }
}