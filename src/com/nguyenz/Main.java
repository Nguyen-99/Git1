package com.nguyenz;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Git 1");
        People p=new Developer(1,"NguyenKhoiNguyen", (byte) 22,"java_fullstack_developer","luvina");
        System.out.println(p.getName());
        System.out.println(p);
        p.work();
    }
}
