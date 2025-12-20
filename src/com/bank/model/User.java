package com.bank.model;

import com.bank.util.IdGenerator;

public class User {
    private String userId;
    private String name;
    private String mobileNumber;
    private String address;
    private String email;
    IdGenerator id = new IdGenerator();
    //Constructor
    //1. class name and constructor name should be same
    //2. Does not have any return type
    // Access modifiers -> public,private,protected,default
    public User(String name, String mobileNumber, String address, String email) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.address = address;
        this.email = email;
        this.userId = id.generateUserId();
        // user input - user details , account create
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
