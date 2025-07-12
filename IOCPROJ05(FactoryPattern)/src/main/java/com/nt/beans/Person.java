package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
private String name;
private String addr;

private AdharDetails ad;
public Person(String name,String addr,AdharDetails ad) {
	this.name=name;
	this.addr=addr;
	this.ad=ad;
}
@Override
public String toString() {
    return name + " | " + addr + " | " + addr;
}
}
