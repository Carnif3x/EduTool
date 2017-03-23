package com.edutool;

import java.util.*;

/**
 * Created by vashanin on 22/03/17.
 */

public class Teacher extends User {
    static {
        Teacher.setUserType(UserType.TEACHER);
    }

    private Set<Student> listOfStudents;
    private Set<Subject> listOfSubjects;

    public Teacher(int id, String firstName, String secondName, String userLogin, Set<Student> listOfStudents, Set<Subject> listOfSubjects) {
        super(id, firstName, secondName, userLogin);
        this.listOfStudents = listOfStudents;
        this.listOfSubjects = listOfSubjects;
    }

    public void putMark(Subject subject, Student student) {
        student.addMark(new Mark(subject, student, this));
    }

    public Set<Student> getListOfStudents() {
        return listOfStudents;
    }

    public Set<Subject> getListOfSubjects() {
        return listOfSubjects;
    }

    public void setListOfStudents(Set<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    public void setListOfSubjects(Set<Subject> listOfSubjects) {
        this.listOfSubjects = listOfSubjects;
    }

    public void addStudent(Student student) {
        listOfStudents.add(student);
    }

    public void addSubject(Subject subject) {
        listOfSubjects.add(subject);
    }

    public void removeStudent(Student student) {
        listOfStudents.remove(student);
    }

    public void removeSubject(Subject subject) {
        listOfSubjects.remove(subject);
    }
}
