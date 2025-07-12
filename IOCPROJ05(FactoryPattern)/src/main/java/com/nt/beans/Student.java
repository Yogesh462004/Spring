package com.nt.beans;



public class Student extends Person {
    public Student(String name, String addr, AdharDetails adhar) {
        super(name, addr, adhar);
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
}

