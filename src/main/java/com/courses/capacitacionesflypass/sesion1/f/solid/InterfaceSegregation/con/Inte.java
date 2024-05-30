package com.courses.capacitacionesflypass.sesion1.f.solid.InterfaceSegregation.con;

// Interfaz para iniciar y cerrar sesión
interface Sesion {
    void iniciarSesion();
    void cerrarSesion();
}

// Interfaz para cambiar la contraseña
interface CambioContrasena {
    boolean cambiarContraseña(String nuevaContraseña);
}

// Interfaz para la autenticación de administradores
interface AutenticaciónAdministrador extends Sesion, CambioContrasena {
    // Podríamos agregar métodos específicos de administrador si es necesario
    void log();
}

// Interfaz para la autenticación de usuarios regulares
interface AutenticaciónUsuarioRegular extends Sesion {
    // Los usuarios regulares no tienen permiso para cambiar la contraseña
}
