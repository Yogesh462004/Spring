package com.nt.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Person;

public class App {
	public static void main(String[] args) {
        try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml")) {
            Person student = (Person) ctx.getBean("studentPerson");
            System.out.println(student);

            Person customer = (Person) ctx.getBean("customerPerson");
            System.out.println(customer);
        }
    }

}
