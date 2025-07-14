package com.nt.test;

import java.util.Locale;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Client {

	public static void main(String[] args) {
       
       ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
       Locale locale=new Locale(args[0],args[1]);
       String msg1=ctx.getMessage("wish.msg", new String[] {},locale);
       System.out.println(msg1);
       
	}

}
