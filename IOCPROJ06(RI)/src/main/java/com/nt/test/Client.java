package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.Controller1;
import com.nt.model.Customer;

public class Client {

	public static void main(String[] args) {
       Customer cust=new Customer();
       cust.setName("Yogesh");
       cust.setAmount(100);
       cust.setBill(200);
       cust.setDiscount(10);
       ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
       Controller1 con=ctx.getBean("cont",Controller1.class);
       try {
    	   String result=con.registerCust(cust);
    	   System.out.println(result);
       }catch(Exception e) {
    	   e.printStackTrace();
       }
	}

}
