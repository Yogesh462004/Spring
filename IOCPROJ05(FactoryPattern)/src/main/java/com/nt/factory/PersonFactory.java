package com.nt.factory;

import com.nt.beans.*;

public class PersonFactory {

    public static Person getPerson(String type, String name, String addr, long adharNo) {
        AdharDetails adhar = new AdharDetails(adharNo);
        if ("student".equalsIgnoreCase(type)) {
            return new Student(name, addr, adhar);
        } else if ("customer".equalsIgnoreCase(type)) {
            return new Customer(name, addr, adhar);
        } else {
            throw new IllegalArgumentException("Unknown person type");
        }
    }
}
