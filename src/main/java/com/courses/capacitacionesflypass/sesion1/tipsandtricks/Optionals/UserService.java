package com.courses.capacitacionesflypass.sesion1.tipsandtricks.Optionals;


import java.util.Optional;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> getUserById(String id) {
        return userRepository.findById(id);
    }

    //OR ELSES

    public String getUserNameById(String id) {
        return userRepository.findById(id)
                .map(User::getName)
                .orElse("Unknown UserClass");
    }

    public User getUserOrCreateDefault(String id) {
        return userRepository.findById(id)
                .orElseGet(() -> new User(id, "Default UserClass", "default@example.com"));
    }

    public String getUserEmailById(String id) {
        return userRepository.findById(id)
                .map(User::getEmail)
                .orElseThrow(() -> new RuntimeException("UserClass not found"));
    }


    //Presents


    public boolean isUserEmailPresent(String id) {
        return userRepository.findById(id)
                .map(User::getEmail)
                .isPresent();
    }


    //If Presents realiza acciones si se encuentra presente el valor


    public void printUserEmailIfExists(String id) {
        userRepository.findById(id)
                .map(User::getEmail)
                .ifPresent(email -> System.out.println("UserClass email: " + email));
    }

    public void deleteUserIfPresent(String id) {
        userRepository.findById(id)
                .ifPresent(user -> userRepository.deleteById(id));
    }


    public void printUserNameOrDefault(String id) {
        userRepository.findById(id)
                .ifPresentOrElse(
                        user -> System.out.println("UserClass name: " + user.getName()),
                        () -> System.out.println("UserClass not found, using default: Default UserClass")
                );
    }
}
