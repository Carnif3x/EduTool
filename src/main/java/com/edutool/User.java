package com.edutool;

/**
 * Created by vashanin on 22/03/17.
 */
public abstract class User {
    private int id;

    private String firstName;
    private String secondName;
    private String userLogin;

    private static UserType userType;

    public User(int id, String firstName, String secondName, String userLogin) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.userLogin = userLogin;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public String getSecondName() {
        return secondName;
    }

    public static UserType getUserType() {
        return userType;
    }

    protected static void setUserType(UserType userType) {
        User.userType = userType;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
