package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Cricketer;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
    	Cricketer c=ctx.getBean("cricketer",Cricketer.class);
    	c.batting();
    	ctx.close();

    }
}
