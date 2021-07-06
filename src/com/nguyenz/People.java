package com.nguyenz;

public class People {
    private int id;
    private String name;
    private byte age;

    public People() {
    }
    
    public People(int id,String name,byte age){
        this.id=id;
        this.name=nam;
        this.age=age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }
}
