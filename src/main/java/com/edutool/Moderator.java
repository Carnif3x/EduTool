package com.edutool;

import java.util.Set;

/**
 * Created by vashanin on 22/03/17.
 */
public class Moderator extends User {
    static {
        Moderator.setUserType(UserType.MODERATOR);
    }

    private Set<User> bannedUsers;

    public Moderator(int id, String firstName, String secondName, String userLogin) {
        super(id, firstName, secondName, userLogin);
    }

    public void banUser(User user) {
        bannedUsers.add(user);
    }

    public void unbanUser(User user) {
        bannedUsers.remove(user);
    }
}
