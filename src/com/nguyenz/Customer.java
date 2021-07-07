package com.nguyenz;

public class Customer extends People {
    private String address;
    private String phone;
    private String email;

    public Customer() {
    }

    public Customer(int id, String name, byte age, String address) {
        super(id, name, age);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void work() {
        System.out.println("Buy service");
    }
}
