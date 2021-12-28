package com.samsung.model;

public class Student extends Person {
    private String group;
    private int score;

    public Student(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
    }

    public Student(String firstName, String secondName, int age, String phone) {
        super(firstName, secondName, age, phone);
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
