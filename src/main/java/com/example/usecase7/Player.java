package com.example.usecase7;

import java.util.List;

public class Player {

    public Player(String name, int age, int experience, List<Integer> skills) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.skills = skills;
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

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public List<Integer> getSkills() {
        return skills;
    }

    public void setSkills(List<Integer> skills) {
        this.skills = skills;
    }

    public String name;
    public int age;
    public int experience;
    public List<Integer> skills;
}
