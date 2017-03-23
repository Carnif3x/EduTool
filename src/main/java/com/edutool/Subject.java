package com.edutool;

import java.util.Set;

/**
 * Created by vashanin on 22/03/17.
 */
public class Subject {
    private String name;
    private Set<Lecture> lectures;
    private Set<Task> tasks;

    public Subject(String name, Set<Lecture> lectures, Set<Task> tasks) {
        this.name = name;
        this.lectures = lectures;
        this.tasks = tasks;
    }

    public String getName() {
        return name;
    }

    public Set<Lecture> getLectures() {
        return lectures;
    }

    public Set<Task> getTasks() {
        return tasks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLectures(Set<Lecture> lectures) {
        this.lectures = lectures;
    }

    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }

    public void addLecture(Lecture lecture) {
        lectures.add(lecture);
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeLecture(Lecture lecture) {
        lectures.remove(lecture);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }
}
