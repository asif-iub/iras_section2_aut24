package oop.iras_section2_aut24;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    public List<User> getUsers() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("asif", "1234", "Admin"));
        userList.add(new User("test", "test", "User"));
//        userList.add(new User("guest", "0987", "Guest"));

        return userList;
    }
}
