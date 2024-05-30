package com.courses.capacitacionesflypass.sesion1.f.solid.InterfaceSegregation.con;



interface ImprimibleAColor {
    void imprimir();

}

interface ImprimibleABlacoYNegro {
    void imprimir();

}
interface Imprimible extends ImprimibleAColor, ImprimibleABlacoYNegro{
void imprimir2();
void imprimirAColor2();

}
interface Escaneable {
    void escanear();
}

interface Faxeable {
    void enviarFax();
}
