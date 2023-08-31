package com.example.usecase7;

import lombok.Getter;

public class Student {

    private String name;

    public Student() {
    }

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean isExceptional() {
        return exceptional;
    }

    public void setExceptional(boolean exceptional) {
        this.exceptional = exceptional;
    }

    public boolean isHonorRoll() {
        return honorRoll;
    }

    public void setHonorRoll(boolean honorRoll) {
        this.honorRoll = honorRoll;
    }

    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    private int age;
    private int grade;
    private boolean exceptional;
    private boolean honorRoll;
    private boolean passed;

}
