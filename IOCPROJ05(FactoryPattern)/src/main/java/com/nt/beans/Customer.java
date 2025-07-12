package com.nt.beans;

public class Customer extends Person {
    public Customer(String name, String addr, AdharDetails adhar) {
        super(name, addr, adhar);
    }

    @Override
    public String toString() {
        return "Customer: " + super.toString();
    }
}
