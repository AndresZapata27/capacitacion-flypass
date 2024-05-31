package com.courses.capacitacionesflypass.sesion1.d.buenaspracticas.kiss.usermanager;

public class MainUserManager {

    public static void main(String[] args) {

        UserManagerBad userManagerBad = new UserManagerBad();
        userManagerBad.addUser("Alice");
        userManagerBad.addUser("Bob");
        userManagerBad.addUser("");
        userManagerBad.addUser(null);
        userManagerBad.addUser("Alice");
        userManagerBad.removeUser("Alice");
        userManagerBad.removeUser("Charlie");
        userManagerBad.removeUser("");
        userManagerBad.removeUser(null);
        System.out.println("All users: " + userManagerBad.getUsers());



        UserManager userManager = new UserManager();
        userManager.addUser("Alice");
        userManager.addUser("Bob");
        userManager.addUser("");
        userManager.addUser(null);
        userManager.addUser("Alice");
        userManager.removeUser("Alice");
        userManager.removeUser("Charlie");
        userManager.removeUser("");
        userManager.removeUser(null);
        System.out.println("All users: " + userManager.getUsers());
    }

}
