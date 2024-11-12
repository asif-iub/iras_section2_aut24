package oop.iras_section2_aut24;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private static List<User> userList = new ArrayList<>();
    private static User loggedInUser = null;

    static {
        userList.add(new User("asif", "1234", "Admin"));
        userList.add(new User("test", "test", "User"));
        userList.add(new User("guest", "0987", "Guest"));
    }

    public static List<User> getUsers() {
        return userList;
    }

    public static void addUser(User u) {
        userList.add(u);
    }

    public static void deleteUser(User u) {
        userList.remove(u);
    }

    public static User getLoggedInUser() {
        return loggedInUser;
    }

    public static void setLoggedInUser(User loggedInUser) {
//        if (loggedInUser.isActive())
            UserManager.loggedInUser = loggedInUser;
    }
}
