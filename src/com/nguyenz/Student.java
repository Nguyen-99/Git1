package com.nguyenz;

public class Student extends People{
    private String major;
    private String university;

    public Student() {
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public void work() {
        System.out.println("Learn");
    }
}
