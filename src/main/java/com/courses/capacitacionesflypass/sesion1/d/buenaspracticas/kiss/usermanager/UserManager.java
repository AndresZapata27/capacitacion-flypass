package com.courses.capacitacionesflypass.sesion1.d.buenaspracticas.kiss.usermanager;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<String> users;

    public UserManager() {
        users = new ArrayList<>();
    }


    // KISS usos comunes Condiciones complejas, que tenga muchos IFs y Else, apliques Kiss
    // Creacion de objetos Complejos o MAPEOS, que tengan muchas relaciones

    public void addUser(String user) {
        if (isValidUser(user) && !users.contains(user)) {
            users.add(user);
            System.out.println("UserClass added: " + user);
        } else {
            System.out.println("Failed to add user: " + user);
        }
    }

    public void removeUser(String user) {
        if (isValidUser(user) && users.remove(user)) {
            System.out.println("UserClass removed: " + user);
        } else {
            System.out.println("Failed to remove user: " + user);
        }
    }

    private boolean isValidUser(String user) {
        return user != null && !user.isEmpty();
    }

    public List<String> getUsers() {
        return users;
    }


}
