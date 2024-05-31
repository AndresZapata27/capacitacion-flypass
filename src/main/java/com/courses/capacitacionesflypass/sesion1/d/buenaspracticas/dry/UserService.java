package com.courses.capacitacionesflypass.sesion1.d.buenaspracticas.dry;

public class UserService {


    public void createUser(String username, String password) {
        validateCredentials(username, password);
        // Lógica para crear un usuario
    }

    public void updateUser(String username, String password) {
        validateCredentials(username, password);
        // Lógica para actualizar un usuario
    }

    private void validateCredentials(String username, String password) {
        if (username == null || username.isEmpty() || password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Username and password cannot be empty");
        }
    }
}
