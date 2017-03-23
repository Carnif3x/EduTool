package com.edutool;

/**
 * Created by vashanin on 23/03/17.
 */
public class Mark {
    private Subject subject;
    private Marks mark;
    private Teacher teacher;

    public Mark(Subject subject, Marks mark, Teacher teacher) {
        this.subject = subject;
        this.mark = mark;
        this.teacher = teacher;
    }

    public Subject getSubject() {
        return subject;
    }

    public Marks getMark() {
        return mark;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
