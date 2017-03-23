package com.edutool;

/**
 * Created by vashanin on 22/03/17.
 */
public class Admin extends User {
    static {
        Admin.setUserType(UserType.ADMIN);
    }

    private static Admin admin = new Admin();

    public static Admin getAdmin() {
        return admin;
    }

    private Admin() {
        super(0, "Vlad", "Shanin", "Vashanin");
    }
}