package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
public class Voting {
	@Value("${per.age}")
	private int age;
	@Value("${per.name}")
	private String name;
	public String msg() {
		if (age>=18) {
			return "Eligible";
		}else {
			return "Not eleigible";
		}
	}
	public void myInit() {
		System.out.println("Voting.myInit()");
	}
	public void myDestroy() {
		System.out.println("Voting.myDestroy()");
	}

}
