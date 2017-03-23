package com.edutool;

import java.util.List;

/**
 * Created by vashanin on 22/03/17.
 */
public class Student extends User {
    static {
        Student.setUserType(UserType.STUDENT);
    }

    private List<Mark> marks;

    public void addMark(Mark mark) {
        marks.add(mark);
    }

    public Student(int id, String firstName, String secondName, String userLogin) {
        super(id, firstName, secondName, userLogin);
    }

}
