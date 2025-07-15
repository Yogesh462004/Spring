package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cfgs.AppConfig;
import com.nt.controller.Controller1;
import com.nt.model.Customer;

public class Client {

	public static void main(String[] args) {
      
       
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
       Customer cust=ctx.getBean("customer",Customer.class);//default bean id
       Controller1 con=ctx.getBean("cont",Controller1.class);
      
       try {
    	   String result=con.registerCust(cust);
    	   System.out.println(result);
       }catch(Exception e) {
    	   e.printStackTrace();
       }
	}

}
