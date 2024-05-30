package com.courses.capacitacionesflypass.sesion1.tipsandtricks.Optionals;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UserRepository {

    private final Map<String, User> userStorage = new HashMap<>();

    public UserRepository() {
        userStorage.put("1", new User("1", "admin", "admin@admin.com"));
        userStorage.put("2", new User("2", "user", "user@user.com"));
        userStorage.put("3", new User("3", "user2", "user2@user2.com"));
    }

    public void save(User user) {
        userStorage.put(user.getId(), user);
    }

    public Optional<User> findById(String id) {
        return Optional.ofNullable(userStorage.get(id));
    }

    public void deleteById(String id) {
        userStorage.remove(id);
    }
}
