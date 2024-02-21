package org.example.model;

import org.example.enums.Gender;

public  class LibraryUser {
    private  String name;
    private int id;
    private Gender gender;
    private boolean isTeacher;
    private boolean isSenior;
    private boolean isJunior;
    private int priority;

    public LibraryUser(String name, int id, Gender gender, boolean isTeacher, boolean isSenior, boolean isJunior, int priority) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.isTeacher = isTeacher;
        this.isSenior = isSenior;
        this.isJunior = isJunior;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Gender getGender() {
        return gender;
    }

    public boolean isTeacher() {
        return isTeacher;
    }

    public boolean isSenior() {
        return isSenior;
    }

    public boolean isJunior() {
        return isJunior;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "LibraryUser{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gender=" + gender +
                ", isTeacher=" + isTeacher +
                ", isSenior=" + isSenior +
                ", isJunior=" + isJunior +
                ", priority=" + priority +
                '}';
    }
}
