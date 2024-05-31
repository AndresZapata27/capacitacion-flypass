package com.courses.capacitacionesflypass.sesion1.f.tipsandtricks.optionals;


import java.util.Optional;

public class Main {

    public static void main(String[] args) {


        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);


        User user = new User("1", "John Doe", "john.doe@example.com");
        userRepository.save(user);


        // Ejemplo de uso de orElse
        String userName = userService.getUserNameById("2");
        System.out.println("UserClass name: " + userName);

        // Ejemplo de uso de orElseThrow
        try {
            String userEmail = userService.getUserEmailById("2");
            System.out.println("UserClass email: " + userEmail);
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }

        // Ejemplo de uso de orElseGet
        User defaultUser = userService.getUserOrCreateDefault("2");
        System.out.println("Default user: " + defaultUser.getName());

        // Ejemplo de uso de isPresent
        boolean isEmailPresent = userService.isUserEmailPresent("1");
        System.out.println("Is user email present: " + isEmailPresent);


        // Ejemplo de uso de ifPresent
        userService.printUserEmailIfExists("1");

        // Ejemplo de uso de ifPresent para borrar usuario
        userService.deleteUserIfPresent("1");
        Optional<User> foundUser = userService.getUserById("1");
        foundUser.ifPresent(u -> System.out.println("UserClass found: " + u.getName()));

        // Ejemplo de uso de ifPresentOrElse
        userService.printUserNameOrDefault("2");
    }
}
