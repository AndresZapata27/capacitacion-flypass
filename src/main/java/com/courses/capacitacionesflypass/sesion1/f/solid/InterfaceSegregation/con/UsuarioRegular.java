package com.courses.capacitacionesflypass.sesion1.f.solid.InterfaceSegregation.con;

class UsuarioRegular implements AutenticaciónUsuarioRegular {
    @Override
    public void iniciarSesion() {
        System.out.println("Iniciando sesión como usuario regular...");
        // Lógica de inicio de sesión para usuario regular
    }

    @Override
    public void cerrarSesion() {
        System.out.println("Cerrando sesión como usuario regular...");
        // Lógica de cierre de sesión para usuario regular
    }
}