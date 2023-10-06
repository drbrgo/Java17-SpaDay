package org.launchcode.data;

import org.launchcode.models.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserData {

    private static final Map<String, User> users = new HashMap<>();

    public static Collection<User> getAll() {
        return users.values();
    }

    public static void add(User user) {
        users.put(user.getEmail(), user);
    }

    public static User getByEmail(String email) {
        return users.get(email);
    }

    public static void remove(String email) {
        if (users.containsKey(email)) {
            users.remove(email);
        }

    }




}
