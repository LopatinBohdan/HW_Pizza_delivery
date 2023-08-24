package com.example.hw_pizza_delivery;

import java.io.Serializable;
import java.util.ArrayList;

public class PiazzaOrder implements Serializable {
    private String base;
    private String toppings;
    private String name;
    private String phone;
    private String email;
    private String address;

    public PiazzaOrder(){
        this.base="";
        this.toppings="";
        this.name="";
        this.phone="";
        this.email="";
        this.address="";
    }

    public PiazzaOrder(String base, String toppings, String name, String phone, String email, String address) {
        this.base = base;
        this.toppings = toppings;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
