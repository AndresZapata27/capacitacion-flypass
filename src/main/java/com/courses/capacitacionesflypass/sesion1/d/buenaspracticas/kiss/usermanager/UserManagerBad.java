package com.courses.capacitacionesflypass.sesion1.d.buenaspracticas.kiss.usermanager;

import java.util.ArrayList;
import java.util.List;

public class UserManagerBad {
    private List<String> users;

    public UserManagerBad() {
        users = new ArrayList<>();
    }

    public void addUser(String user) {
        if (user != null && !user.isEmpty()) {
            if (!users.contains(user)) {
                users.add(user);
                System.out.println("UserClass added: " + user);
            } else {
                System.out.println("UserClass already exists: " + user);
            }
        } else {
            System.out.println("Invalid user.");
        }
    }

    public void removeUser(String user) {
        if (user != null && !user.isEmpty()) {
            if (users.contains(user)) {
                users.remove(user);
                System.out.println("UserClass removed: " + user);
            } else {
                System.out.println("UserClass not found: " + user);
            }
        } else {
            System.out.println("Invalid user.");
        }
    }

    public List<String> getUsers() {
        return users;
    }


}
