package com.courses.capacitacionesflypass.sesion1.f.solid.InterfaceSegregation.con;

class Administrador implements AutenticaciónAdministrador {
    @Override
    public void iniciarSesion() {
        System.out.println("Iniciando sesión como administrador...");
        // Lógica de inicio de sesión para administrador
    }

    @Override
    public void cerrarSesion() {
        System.out.println("Cerrando sesión como administrador...");
        // Lógica de cierre de sesión para administrador
    }

    @Override
    public boolean cambiarContraseña(String nuevaContraseña) {
        System.out.println("Cambiando contraseña como administrador...");
        // Lógica de cambio de contraseña para administrador
        return true;
    }

    @Override
    public void log() {
        System.out.println("Log de administrador...");
        // Lógica de log para administrador
    }
}
