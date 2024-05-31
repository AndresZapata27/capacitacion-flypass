package com.courses.capacitacionesflypass.sesion1.d.buenaspracticas.dry;

public class UserServiceBad {


    public void createUser(String username, String password) {
        if (username == null || username.isEmpty() || password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Username and password cannot be empty");
        }
        // Lógica para crear un usuario
    }

    public void updateUser(String username, String password) {
        if (username == null || username.isEmpty() || password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Username and password cannot be empty");
        }
        // Lógica para actualizar un usuario
    }
}
