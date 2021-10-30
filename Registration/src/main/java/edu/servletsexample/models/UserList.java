package edu.servletsexample.models;

import java.util.HashMap;
import java.util.Map;

public class UserList {
    private static Map<String, User> users = new HashMap();

    public static User findUser(String user) {
        return users.get(user);
    }

    public static boolean addUser(User user) {
        boolean result = false;
        if ((!users.containsKey(user.getUser())) && (user.getPassword() != null) &&
                (!"".equals(user.getPassword()))) {
            users.put(user.getUser(), user);
            result = true;

        }
        return result;
    }
}
