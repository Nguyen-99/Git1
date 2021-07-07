package com.nguyenz;

public class Customer extends People {
    private String address;
    private String phone;
    private String email;

    public Customer() {
    }

    @Override
    public void work() {
        System.out.println("Buy service");
    }
}
