package com.courses.capacitacionesflypass.sesion1.f.solid.InterfaceSegregation.sin;

interface Autenticable {
    void iniciarSesion();
    void cerrarSesion();
    boolean cambiarContraseña(String nuevaContraseña);
}