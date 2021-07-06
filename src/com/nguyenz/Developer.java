package com.nguyenz;

public class Developer extends People {
    private String position;
    private String company;

    public Developer() {
    }

    public Developer(int id, String name, byte age, String position, String company) {
        super(id, name, age);
        this.position = position;
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public void work() {
        System.out.println("Code");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "position='" + position + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
