package com.nguyenz;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Git 1");
        People people=new People();
        people.setId(163424890);
        people.setName("NguyenKhoiNguyen");
        people.setAge((byte) 22);
        System.out.println(people);
    }
}
