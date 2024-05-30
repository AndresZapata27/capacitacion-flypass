package com.courses.capacitacionesflypass.sesion1.f.solid.InterfaceSegregation.sin;

class UsuarioRegular implements Autenticable {
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

    @Override
    public boolean cambiarContraseña(String nuevaContraseña) {
        // No permitir a los usuarios regulares cambiar la contraseña
        System.out.println("Los usuarios regulares no pueden cambiar la contraseña.");
        return false;
    }
}