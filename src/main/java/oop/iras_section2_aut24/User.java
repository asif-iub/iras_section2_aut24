package oop.iras_section2_aut24;

import java.io.Serializable;

public class User implements Serializable {
    public static String[] USER_TYPES = {"Admin", "User", "Guest"};

    private String username, password;
    private String userType;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public User(String username, String password, String userType) {
        this.username = username;
        this.password = password;
        this.userType = userType;
    }

    public User() {
        this.username = "guest";
        this.password = "1234";
        this.userType = USER_TYPES[2];
    }
}
